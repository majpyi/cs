import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

//@WebServlet(urlPatterns = "/base")
public class BaseServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("doPost");
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("doGet");
    }
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getWriter().println(111);
//        req.setCharacterEncoding("UTF-8");
//        resp.setContentType("text/html;charset=utf-8");
        try {
            String method = req.getParameter("method");
            System.out.println(method);
            Class z = this.getClass();
            Method m = z.getDeclaredMethod(method,HttpServletRequest.class, HttpServletResponse.class);
            String result =(String) m.invoke(this,req,resp);
            if(result != null && !result.isEmpty()) {
                req.getRequestDispatcher(result).forward(req, resp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
