import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CookieServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Cookie cookie = new Cookie("username", "Sangmesh");
        response.addCookie(cookie);

        PrintWriter out = response.getWriter();
        out.println("Cookie Added");
    }
}