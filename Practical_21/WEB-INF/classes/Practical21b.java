import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Practical21b extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) {

        try {

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            HttpSession session = request.getSession(false);

            String name = (String) session.getAttribute("name");
            String lang = (String) session.getAttribute("lang");

            out.print("Hello " + name);
            out.print("Your Selected Language is " + lang);

            out.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
