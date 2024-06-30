<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>      
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products list</title>
<style>
	h1{
		color:red;
	}
</style>
</head>
<body>
<h1>Product List</h1>
<table border="2">
	<tr>
		<th>Product id</th>
		<th>Product name</th>
		<th>Quantity</th>
		<th>Price</th>
		<th>Action</th>
	</tr>
	<c:forEach var="p" items="${plist}">
		<tr>
			<td>${p.pid}</td>
			<td>${p.pname}</td>
			<td>${p.qty}</td>
			<td>${p.price}</td>
			<td>
				<a href="addtocart/${p.pid}">add to cart</a>
			</td>
		</tr>
	</c:forEach>
</table>

</body>
</html>