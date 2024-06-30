<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>      
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Cart</title>
<style>
	h1{
		color:red;
	}
</style>
</head>
<body>
<h1>Items in Cart</h1>
<c:set var="total" value="0.0" />

<table border="1">
  <tr>
    <th>Product ID</th>
    <th>Product Name</th>
    <th>Price</th>
    <th>Remove</th>
  </tr>
  <c:forEach items="${cartlist}" var="item">
  <tr>
    <td>${item.pid}</td>
    <td>${item.pname}</td>
    <td>${item.price}</td>
    <td><a href="/SpringMvcEmpProd/product/removeitem/${item.pid}">Remove</a></td>
  </tr>
  <c:set var="total" value="${total + item.price}" />
  </c:forEach>
</table>

<h4>
  Total bill : ${total}<br>
  Please pay to proceed further
</h4>
<button type="submit" name="btn" id="btn">Tap to pay</button><br><br>

<a href="/SpringMvcEmpProd/product/viewproduct">Back</a>&nbsp;&nbsp;
<a href="/SpringMvcEmpProd/product/emptycart">Empty the cart</a>


</form>
</body>
</html>