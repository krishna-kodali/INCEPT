 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Management System</title>
</head>
<body>
<table>
	<td><h1>Welcome To EMS!</h1></td>
	<td align="left"><a href='<c:url value="/j_spring_security_logout"/>'>Logout</a></td>
</table>
Please enter the following details to create an Employee. <br>
All fields are required. <br>
<s:form action='createUser'>
<table>
	<tr>
		<td>User First Name:</td>
		<td><s:textfield name="user.userFirstName" /></td>
	</tr>
	<tr>
		<td>User Last Name:</td>
		<td><s:textfield name="user.userLastName" /></td>
	</tr>
	<tr>
		<td colspan="2"><s:submit/></td>
	</tr>
</table>

</s:form>
</body>
</html>