<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Employee details</title>
<style>
	h1{
		color:red;
	}
</style>
</head>
<body>
<h1>Update Employee details</h1>
<form action="/SpringMvcEmpProd/employee/updateemp" method="post">
Id : <input type="text" name="id" id="id" value="${e.id}" readonly><br>
Name : <input type="text" name="name" id="name" value="${e.name}" ><br>
Role : <input type="text" name="role" id="role" value="${e.role}" ><br>
Salary : <input type="text" name="salary" id="salary" value="${e.salary}" ><br>
<button type="submit" name="btn" id="btn" value="add">Update Employee</button>
</form>
</body>
</html>