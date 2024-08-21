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
        hitCount++;
        request.setAttribute("hitCount", hitCount);
        request.getRequestDispatcher("countHits.jsp").forward(request, response);
    }
}