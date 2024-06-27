<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="2">
<tr>
	<th>Id</th>
	<th>Name</th>
	<th>Role</th>
	<th>Salary</th>
	<th>Action</th>
</tr>
<c:forEach var="e" items="${elist}">

<tr>
	<td>${e.id}</td>
	<td>${e.name}</td>
	<td>${e.role}</td>
	<td>${e.salary}</td>
	<td>
		<a href="editemployee/${e.id}">edit</a>
		<a href="deleteemployee/${e.id}">delete</a>
	</td>
</tr>
</c:forEach>
</table>
<a href="addnewemployee">Add new Employee</a>
</body>
</html>