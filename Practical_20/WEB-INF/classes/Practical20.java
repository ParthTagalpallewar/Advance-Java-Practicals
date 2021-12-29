import javax.servlet.http.*;
import java.io.*;

public class Practical20 extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) {

        PrintWriter out = null;

        try {

            out = res.getWriter();

            String name = req.getParameter("name");
            String age = req.getParameter("age");
            String address = req.getParameter("address");
            String phone = req.getParameter("phone");
            String email = req.getParameter("email");

            res.addCookie(new Cookie("name", name));
            res.addCookie(new Cookie("age", age));
            res.addCookie(new Cookie("address", address));
            res.addCookie(new Cookie("phone", phone));
            res.addCookie(new Cookie("email", email));

            out.println("<html>");
            out.println("<body>");
            out.println("Cokkies set Successfully");
            out.println("</body>");
            out.println("</html>");

        } catch (Exception ex) {
            out.println(ex);
            out.println(ex.getLocalizedMessage());
        } finally {
            out.close();
        }
    }
}