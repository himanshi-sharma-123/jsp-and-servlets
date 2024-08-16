package backend;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/myLogin")
public class Login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String myEmail = req.getParameter("email1");
       String myPass = req.getParameter("pass1");

       if(myEmail.equals("himanshi@gmail.com") && myPass.equals("h@123")){
           System.out.println("Success");
       }else{
           System.out.println("Failed");
       }

    }
}
