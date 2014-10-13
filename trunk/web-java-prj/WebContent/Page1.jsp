<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
div { width: 250px ; height: 300px; border: 1px solid; background-color: blue;

	
}
</style>
</head>
<body>
<form action="InsertDB" method="post">
<div>
<table>
<tr>
<td>Username:</td>
<td><input type="text" name="user" ></td>
</tr>
<tr>
<td>Password:</td>
<td><input type="text" name="pass" ></td>
</tr>
<tr>
<td>Confirm Password:</td>
<td><input type="text" name="repass" ></td>
</tr>
<tr>
<td>Phone:</td>
<td><input type="text" name="phone" ></td>
</tr>
<tr>
<td>Email:</td>
<td><input type="text" name="email" ></td>
</tr>
<tr>
<td><input type="submit" name="add" value="ADD"></td>
<td><input type="reset" name="reset" value="Reset" ></td>
</tr>
</table>
</div>
</form>
</body>
</html>