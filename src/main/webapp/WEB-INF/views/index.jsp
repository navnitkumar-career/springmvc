<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>This is Home Page</h1>
	<%
	//String name = (String)request.getAttribute("name"); 
	List<String> friends = (List<String>) request.getAttribute("friends");
	%>
	<p>
		Name is :
		<%-- <%= name %> --%>
		${name}
	</p>
	<p>
		Friends name is :
		<%
	for (String friend : friends) {
		out.print(friend + ", ");
	}
	%>
	</p>


</body>
</html>