<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Login page</h1>
${msg}
<form action="validateuser" method="post">
 Username : <input type="text" name="uname" id="uname"><br>
 Password : <input type="password" name="pass" id="pass"><br>
 <button type="submit" name="btn" id="btn">Login</button>
 </form>
</body>
</html>