<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Persons</h1>

<c:url var="addUrl" value="/uptake/add" />
<c:url var="famUrl" value="/uptake/showfamily" />
<table style="border: 1px solid; width: 500px; text-align:center">
	<thead style="background:blue">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Income</th>
			<th colspan="4"></th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${persons}" var="person">
			<c:url var="editUrl" value="/uptake/update?id=${person.id}" />
			<c:url var="deleteUrl" value="/uptake/delete?id=${person.id}" />
			<c:url var="getUrl" value="/uptake/get?id=${person.id}" />
			
			
		<tr>
			<td><c:out value="${person.firstName}" /></td>
			<td><c:out value="${person.lastName}" /></td>
			<td><c:out value="${person.money}" /></td>
			<td><a href="${editUrl}">Edit</a></td>
			<td><a href="${deleteUrl}">Delete</a></td>
			<td><a href="${addUrl}">Add</a></td>
			<td><a href="${getUrl}">Get</a></td>
		</tr>
	</c:forEach>
	<tr><td>&nbsp;</td></tr>
	<tr><td><td><a href="${famUrl}">Show Family</a></td></td></tr>
	</tbody>
</table>

<c:if test="${empty persons}">
	There are currently no persons in the list. <a href="${addUrl}">Add</a> a person.
</c:if>

</body>
</html>