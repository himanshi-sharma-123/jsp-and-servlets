package backend;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/submitForm")
public class MyServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String myName = req.getParameter("name1");
        String myEmail = req.getParameter("email1");

        System.out.println(myName + myEmail);

        PrintWriter out = resp.getWriter();
        out.print("Name: " + myName);
        out.print("Email: " + myEmail);


    }
}
