
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>

     <%
        request.setAttribute("request_name", "Himanshi Sharma");
        out.println(request.getAttribute("request_name"));
     %>
     <h3> Hello : ${requestScope.request_name} </h3>




</body>
</html>