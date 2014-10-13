<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List,com.pvt.javabean.Employee" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01s Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	List<Employee> employees = (List<Employee>) request.getAttribute("employees");
%>

<table>
	<th>
		<td>Name</td>
		<td>Phone</td>
		<td>Email</td>
	</th>
	
	<%
		for (Employee e : employees) {
	%>
			<tr>
				<td><%= e.getUsername() %></td>
				<td><%= e.getPhone() %></td>
				<td><%= e.getEmail() %></td>
			</tr>
	<%
		}
	%>
	
</table>



</body>
</html>