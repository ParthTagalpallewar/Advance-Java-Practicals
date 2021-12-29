import javax.servlet.http.*;
import java.io.*;

public class Practical22b extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) {
        PrintWriter out = null;
        try {
            HttpSession session = req.getSession();
            String language = (String) session.getAttribute("lag");
            if (language.equals("marathi")) {
                out = res.getWriter();
                out.println("<html><body><h1>Here is Marathi Books:</h1>");
                out.println("<br> Mulanche Ladke Janoos Korkchak </br>");
                // Mi Aahe Helen Kelar <br>Mi Virodh Karte <br>Manjarichi Pille Kashi Vadhtat
                // ?<br>Manjarichi Pille Kashi Vadhtat ?<br>");
                out.println("</body></html>");
            }

            if (language.equals("hindi")) {
                out = res.getWriter();
                out.println("<html><body><h1>Here is Hindi Books:</h1>");
                out.println("<br> 1857 Ka Sangram by V.S. Walimbe </br>");
                // out.println("<br>1857 Ka Sangram by V.S. Walimbe <br>1857 ki Kahaniyan
                // by Khwaja Hasan Nizami<br>1857 Ki Kahaniyan by Prannath Wanprsthy <br>1857 Ki
                // Kranti Aur
                // Pramukh Krantikari by Bharat Mishra<br>Ambedakar Vaad Ke Sandarbh Me Kashiram
                // Ka Dalit
                // Andolan <br>");
                out.println("</body></html>");
            }
            if (language.equals("english")) {
                out = res.getWriter();
                out.println("<html><body><h1>Here is English Books:</h1>");
                out.println("<br>Charlotte’s Web – E.B. White </br>");
                // out.println("<br>Charlotte’s Web – E.B. White <br>Mieko and the Fifth
                // Treasure – Eleanor Coerr <br>The Outsiders – S.E. Hinton <br>The House On
                // Mango Street – Sandra
                // Cisneros <br>Thirteen Reasons Why – Jay Asher<br>");
                out.println("</body></html>");
            }
        }

        catch (Exception ex) {
            out.println(ex);
        } finally {
            out.close();
        }
    }
}