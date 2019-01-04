import javax.servlet.*;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class noCacheFilterServlet implements Filter {
    @Override
    public void destroy() {

    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

//    @Override
//    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
////        response.setHeader("cache-control","no-cache");
////        response.setHeader("pragma","no-cache");
////        response.setHeader("expires","0");
//        chain.doFilter(request,response);
//    }



    @Override
    public void doFilter(ServletRequest req, ServletResponse res,
                         FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;

// 因为各个浏览器的效果不同，建议三个都写上
        response.setDateHeader("Expires", -1);
        response.setHeader("Cache-Control", "no-cache");
        // 修改
        chain.doFilter(request, response);// 执行目标方法
    }
}
