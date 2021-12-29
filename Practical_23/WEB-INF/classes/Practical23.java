import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

public class Practical23 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("uname");
        String email = request.getParameter("uemail");
        String address = request.getParameter("uaddress");
        String mobileno = request.getParameter("unumber");

        out.print("<html>");
        out.print("<head> <title>Customers_Registration</title></head>");
        out.print("<body><table>");
        out.print("<tr>");
        out.print("<td>Your name is:</td>");
        out.print("<td>" + name + "</td>");
        out.print("</tr>");
        out.print("<tr>");
        out.print("<td>Your email is:</td>");
        out.print("<td>" + email + "</td>");
        out.print("</tr>");
        out.print("<tr>");
        out.print("<td>Your address is:</td>");
        out.print("<td>" + address + "</td>");
        out.print("</tr>");
        out.print("<tr>");
        out.print("<td>Your mobile number is:</td>");
        out.print("<td>" + mobileno + "</td>");
        out.print("</tr>");
        out.print("<tr>");

        out.print("<h2> Your Account Created Successfully</h2>");

        out.print("</tr>");
        out.print("</table></body></html>");
    }
}
