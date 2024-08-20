package backend;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HitCounterServlet extends HttpServlet {
    private int hitCount;

    public void init() {
        hitCount = 0;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Increment hit count
        hitCount++;
        // Set the hit count as a request attribute
        request.setAttribute("hitCount", hitCount);
        // Forward to JSP
        request.getRequestDispatcher("countHits.jsp").forward(request, response);
    }
}