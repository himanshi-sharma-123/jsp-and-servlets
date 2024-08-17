
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.time.LocalDate" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
     <%!
        int a = 19;
        String name = "Himanshi";

        int square()
        {
          return a*a;
        }
     %>

     <%
        out.println("a :" + a);
        out.println("Name :" + name);
        out.println(square());

        int b = 20;

        if(b<100)
        {
          out.println("b is smaller than 100");
        }
        else
        {
          out.println("b is greater than 100");
        }

        for(int i=1; i<=5; i++)
        {
          out.println(i);
        }
     %>

     <%= a %>
     <%= name %>
     <%= square() %>
     <%= LocalDate.now() %>
     <%= Math.random() %>

</body>
</html>