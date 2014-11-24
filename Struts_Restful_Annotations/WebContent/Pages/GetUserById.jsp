<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Get User By ID</title>
</head>
<body>
Please enter the ID of User
<s:form action='getUserById'>
User ID: <s:textfield name="user.userId" id="userId" />
<s:submit/>
</s:form>
</body>
</html>