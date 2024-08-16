package backend;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class MyServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String mySearch = req.getParameter("search1");
//        resp.sendRedirect("https://www.google.com/search?q="+mySearch);

        //****** REQUEST DISPACHTER********8//

        String myEmail = req.getParameter("email1");
        String myPass = req.getParameter("pass1");

        PrintWriter out = resp.getWriter();

        if(myEmail.equals("himanshi@gmail.com") && myPass.equals("h@123")){
            RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
            rd.forward(req,resp);
        }else{
            resp.setContentType("text/html");
            out.print("Email id and password does not match");
            RequestDispatcher rd = req.getRequestDispatcher("/index.html");
            rd.forward(req,resp);        }

    }
}
