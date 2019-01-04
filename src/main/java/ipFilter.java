import javax.servlet.*;
import java.io.IOException;
import java.util.Map;

public class ipFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        ServletContext app = request.getServletContext();
        Map<String,Integer> map = (Map<String, Integer>) app.getAttribute("map");
        String ip  = request.getRemoteAddr();
        if(map.containsKey(ip)){
            map.put(ip,(int)map.get(ip)+1);
        }else {
            map.put(ip,1);
        }
        app.setAttribute("map",map);
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
