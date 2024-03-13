<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome</title>
</head>
<body>
<h1 style="color:red">${errormsg}</h1>
<form action="login" method="post">
Email: <input type="email" name="email"><br><br>
Password: <input type="password" name="password"><br><br>
<input type="submit" value="Log In"><br><br>

</form>
</body>
</html>