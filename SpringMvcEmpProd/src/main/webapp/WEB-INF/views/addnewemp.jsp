<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add new Employee details</title>
<style>
	h1{
		color:red;
	}
</style>
</head>
<body>
<h1>Add employee details here</h1>
<form action="addempdetails" method="post">
Id : <input type="text" name="id" id="id"><br>
Name : <input type="text" name="name" id="name"><br>
Role : <input type="text" name="role" id="role"><br>
Salary : <input type="text" name="salary" id="salary"><br>
<button type="submit" name="btn" id="btn" value="add">Add new Employee</button>
</form>
</body>
</html>