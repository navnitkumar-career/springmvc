<%@page import="javax.servlet.jsp.tagext.TagLibraryInfo"%>
<%@page import="javax.servlet.descriptor.TaglibDescriptor"%>
<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
	<%
	String name = (String) request.getAttribute("name");
	LocalDateTime time = (LocalDateTime) request.getAttribute("time");
	%>
	<h1>
		My Name is:
		<%=name%></h1>
	<h1>This is Help Page</h1>
	<h1>
		Date is:
		<%=time.toString()%></h1>

	<hr>
	<%-- ${mark } --%>
	<c:forEach var="marks" items="${marks }">
		<%-- <h1>${marks }</h1> --%>
		<c:out value="${marks}"></c:out>
	</c:forEach>

</body>
</html>