package backend;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class Login extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String myEmail = req.getParameter("email1");
        String myPass = req.getParameter("pass1");

        PrintWriter out = resp.getWriter();

        if(myEmail.equals("himanshi@gmail.com") && myPass.equals("h@123")){
//            req.setAttribute("name_key", "Himanshi Sharma");
            HttpSession session = req.getSession();
            session.setAttribute("name_key", "Himanshi Sharma");
            RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
            rd.forward(req,resp);
        }else{
            resp.setContentType("text/html");
            out.print("Email id and password does not match");
            RequestDispatcher rd = req.getRequestDispatcher("/index.html");
            rd.forward(req,resp);        }

    }
}
