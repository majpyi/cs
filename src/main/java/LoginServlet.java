import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/Login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        if(username.contains("123")) {
            req.getSession().setAttribute("admin", username);
            System.out.println(1);
        } else {
            req.getSession().setAttribute("username", username);
            System.out.println(2);
        }
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
