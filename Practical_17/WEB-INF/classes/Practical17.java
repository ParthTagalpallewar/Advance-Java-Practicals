import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Practical17 extends HttpServlet 
{ 
    private String mymsg;

    public void init() throws ServletException{ 
        mymsg = "Http Servlet Demo"; 
    }

    public void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
        response.setContentType("text/html"); 
        PrintWriter out = response.getWriter(); 
        out.println("<h1>" + mymsg + "</h1>"); 
        out.println("<p>" + "Hello Friends!" + "</p>"); 
    }

    public void destroy(){}
}
