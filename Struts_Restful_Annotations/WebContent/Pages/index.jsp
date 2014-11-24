<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Struts2 Restful - Welcome</title>
</head>
<body>
<h1>Welcome To Struts 2 Restful Annotations!</h1>
<p><a href="Pages/CreateUser.jsp">Click here to create User</a></p>
<p><a href="Pages/GetUserById.jsp">Click here to get User by ID</a></p>

<!-- Below line can be used by changing the action "value" to "I dont Know" in the Controller -->
<!-- <p>Click <a href="get"> here </a> to retrieve all Users<br/></p> -->

<s:form action='get'>Click here to get the list of all users:	<s:submit/></s:form>
</body>
</html>
<%-- <s:url action='hello'/> --%>