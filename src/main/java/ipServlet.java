import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebServlet;
import java.util.LinkedHashMap;
import java.util.Map;


public class ipServlet implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        Map<String,Integer> map = new LinkedHashMap<>();
        ServletContext app = sce.getServletContext();
        app.setAttribute("map",map);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
