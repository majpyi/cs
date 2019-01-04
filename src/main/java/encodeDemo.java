import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/AAServlet")
public class encodeDemo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setContentType("text/html;charset=utf-8");
//        req.setCharacterEncoding("utf-8");  没有有都不影响
        String name = req.getParameter("name");
        resp.getWriter().println(name);
        System.out.println(name);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setContentType("text/html;charset=utf-8");
//        req.setCharacterEncoding("utf-8");  //必须有
        String name = req.getParameter("name");
        resp.getWriter().println(name);
        System.out.println(new String(name.getBytes("iso-8859-1"),"utf-8"));
        System.out.println(name);

    }
}
