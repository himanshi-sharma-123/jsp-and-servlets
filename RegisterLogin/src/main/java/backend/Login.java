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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/loginForm")
public class Login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        String myemail = req.getParameter("email1");
        String mypass = req.getParameter("pass1");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/yt_demo?useSSL=false";
            String username = "root";
            String password = "free@11905";
            Connection con = DriverManager.getConnection(url, username, password);

            PreparedStatement ps = con.prepareStatement("select * from register where email=? and password=?");
            ps.setString(1 , myemail);
            ps.setString(2, mypass);

            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                HttpSession session = req.getSession();
                session.setAttribute("session_name", rs.getString("name"));
                resp.setContentType("text/html");
                out.print("<h3> style='color:green'> User registered successfully </h3>");
                RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
                rd.include(req, resp);
            }else{
                resp.setContentType("text/html");
                out.print("<h3> style='color:red'> Email id and password do not match </h3>");
                RequestDispatcher rd = req.getRequestDispatcher("/login.jsp");
                rd.include(req, resp);
            }

        }catch (Exception e){
            e.printStackTrace();
            resp.setContentType("text/html");
            out.print("<h3> style='color:red'> "+ e.getMessage() +"</h3>");
            RequestDispatcher rd = req.getRequestDispatcher("/login.jsp");
            rd.include(req, resp);
        }

    }
}
