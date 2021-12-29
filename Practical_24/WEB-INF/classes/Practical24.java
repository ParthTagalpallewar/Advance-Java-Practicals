import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

public class Practical24 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,
            ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try {

            String name = request.getParameter("uname");
            String email = request.getParameter("uemail");
            String address = request.getParameter("uaddress");
            String mobileno = request.getParameter("unumber");

            out.print("<html>");
            out.print("<head> <title>Customers_Registration</title></head>");
            out.print("<body><table>");

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = null;
            Statement stmt = null;
            conn = DriverManager.getConnection("jdbc:mysql://localhost/practical24", "root", "mysql");
            stmt = conn.createStatement();
            String sql = "insert into users values ( 1," + "'" + name + "', '" + mobileno + "', '" + address + "');";
            ResultSet rs = stmt.executeQuery(sql);
            rs.close();
            stmt.close();
            conn.close();
            out.print("</table></body></html>");

        } catch (Exception e) {
            out.print(e.getLocalizedMessage());
        }
    }
}