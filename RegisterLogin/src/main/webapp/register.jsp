
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>

   <form action="regForm" method="post">
       Name : <input type="text" name="name1"/> <br/>
       Email : <input type="text" name="email1"/> <br/>
       Password : <input type="password" name="pass1"/> <br/>
       Gender : <input type="radio" name="gender1"/> Male <input type="radio" name="gender1"/> Female <input type="radio" name="gender1"/> <br/>
       City : <select>
                     <option>Select City</option>
                     <option>Delhi</option>
                     <option>Mumbai</option>
                     <option>Pune</option>
                     <option>Bangalore</option>
              </select> <br/>
       <input type="submit" value="Register"/>
   </form>




</body>
</html>