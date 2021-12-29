import javax.servlet.*;
import java.io.*;

public class Practical16 extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) {
        PrintWriter out = null;
        try {

            out = res.getWriter();
            out.println("<html>");
            out.println("<body>");
            out.println("<font face = \"Gabriola\" size =\"30\" color = \" crimson\">");
            out.println("Hello World From Practical 16</font>");
            out.println("</body>");
            out.println("</html>");

        } catch (Exception ex) {
            out.println(ex);
        } finally {
            out.close();
        }
    }
}