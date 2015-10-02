<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sample Exercise - Result page</title>
</head>
<body>
<h1>Result</h1>
Success! Request has been sent!
<c:url var="allUrl" value="/uptake/getall" />
<table>
<tr><td><a href="${allUrl}">Show All people</a></td></tr>
</table>
</body>
</html>