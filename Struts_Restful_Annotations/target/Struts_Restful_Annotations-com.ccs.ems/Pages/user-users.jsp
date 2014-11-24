 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Users List Page</title>
</head>
<body>
<table>
	<td><h1>Welcome To EMS!</h1></td>
</table>

<table>
	<tr>
		<th>		ID</th>
		<th>FIRST NAME</th>
		<th>LAST NAME</th>
	</tr>
	<s:iterator value="users"> 
		<tr>
			<td> <s:property value="userId"/> </td>
   			<td><s:property value="userFirstName"/></td>
   			<td><s:property value="userLastName"/></td>
   		</tr>
	</s:iterator>
</table>
</body>
</html>