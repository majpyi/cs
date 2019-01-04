import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/ListenerServlet")
public class ListenerServlet extends HttpServlet {
    public String contextOperation(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ServletContext context = this.getServletContext();
        context.setAttribute("a", "a");
        context.setAttribute("a", "A");
        context.removeAttribute("a");
        return "/index.jsp";
    }

    ///////////////////////////////

    public String sessionOperation(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.setAttribute("a", "a");
        session.setAttribute("a", "A");
        session.removeAttribute("a");
        return "/index.jsp";
    }

    ///////////////////////////////

    public String requestOperation(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("a", "a");
        request.setAttribute("a", "A");
        request.removeAttribute("a");
        return "/index.jsp";
    }
}
