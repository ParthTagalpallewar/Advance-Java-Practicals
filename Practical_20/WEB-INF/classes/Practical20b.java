import javax.servlet.http.*;
import java.io.*;

public class Practical20b extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) {

        PrintWriter out = null;
        try {
            out = res.getWriter();
            Cookie arr[] = req.getCookies();

            out.println("<html><body>");
            out.println("<h2> Showing All Cokkies </h2>");

            out.println(arr[0].getName() + " " + arr[0].getValue() + "<br>");
            out.println(arr[1].getName() + " " + arr[1].getValue() + "<br>");
            out.println(arr[2].getName() + " " + arr[2].getValue() + "<br>");
            out.println(arr[3].getName() + " " + arr[3].getValue() + "<br>");
            out.println(arr[4].getName() + " " + arr[4].getValue() + "<br>");

            out.println("</body></html>");
        } catch (Exception ex) {
            out.println(ex);
        } finally {
            out.close();
        }
    }
}