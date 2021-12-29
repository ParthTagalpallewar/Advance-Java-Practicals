import javax.servlet.http.*;
import java.io.*;

public class Practical19 extends HttpServlet
{
    @Override
    public void doPost(HttpServletRequest req,HttpServletResponse res){
        PrintWriter out =null;

        try{
            out = res.getWriter();
            String name = req.getParameter("username");
            Cookie co = new Cookie("Cookie", name);
            res.addCookie(co);
            out.println("<html><body>");
            out.println("Cokkies set successfully</body></html>");
        }
        catch(Exception ex){
            out.println(ex);
        }
        finally{
            out.close();
        }
    }
}
