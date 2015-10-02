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
<h1>Family</h1>

<c:url var="addUrl" value="/uptake/add" />

<c:url var="allUrl" value="/uptake/getall" />
<table style="border: 1px solid; width: 841px; text-align:center" >
	<thead style="background:blue">
		<tr>
			<th>Family ID</th>
			<th>Persons in Family- First Name, Last Name</th>
			<th colspan="6"></th>
		</tr>
	</thead>
	<tbody>
	
	<c:forEach var="entity" items="${map}">
	<tr>
	<td><c:out value="${entity.key}"/></td>
	<c:forEach items="${entity.value}" var="person" varStatus="loop">
		<c:url var="getUrl" value="/uptake/get?id=${person.id}" />
		<td><c:out value="${person.firstName}, ${person.lastName}"/><a href="${getUrl}">Get</a></td>
	
	</c:forEach>
	</tr>
	</c:forEach>	
	</tbody>
	<tr><td><a href="${allUrl}">Show All people</a></td></tr>
</table>

<c:if test="${empty map}">
	There are currently no persons in the list. <a href="${addUrl}">Add</a> a person.
</c:if>

</body>
</html>