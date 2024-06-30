<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee list</title>
<style>
	h1{
		color:red;
	}
</style>
</head>
<body>
<h1>Employee list</h1>
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
		<a href="editemployee/${e.id}">Edit</a>&nbsp;&nbsp;
		<a href="deleteemployee/${e.id}">Delete</a>
	</td>
</tr>
</c:forEach>
</table>
<a href="addnewemployee">Add new Employee</a>
</body>
</html>