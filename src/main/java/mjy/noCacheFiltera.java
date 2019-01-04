package mjy;

import javax.servlet.*;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class noCacheFiltera extends HttpFilter {

//    @Override
//    public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
////        response.setHeader("cache-control","no-cache");
////        response.setHeader("pragma","no-cache");
////        response.setHeader("expires","0");
//        chain.doFilter(request,response);
//    }


    @Override
    public void destroy() {
        System.out.println(111);
    }
}
