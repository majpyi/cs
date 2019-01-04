import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;

public class MyFilter2 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
//        init
//        helloFilter
//        1
//        ws   2
//        mjy   1
//        System.out.println("init");
//        System.out.println(filterConfig.getFilterName());
//        System.out.println(filterConfig.getInitParameter("mjy"));
//        Enumeration names = filterConfig.getInitParameterNames();
//        while (names.hasMoreElements()) {
//            String name = (String)names.nextElement();
//            System.out.println(name + "   " + filterConfig.getInitParameter(name));
//        }
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("start Filter2");
        response.getWriter().println("start2");
        chain.doFilter(request, response);
        response.getWriter().println("over2");
        System.out.println("over Filter2");
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}
