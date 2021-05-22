<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page errorPage="true" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Welcome <% String name=request.getParameter("name");%>

<%=name %> !!! 

Country =<%= getServletContext().getInitParameter("country") %>

<a href="department.jsp">goto department</a>

</body>
</html>

