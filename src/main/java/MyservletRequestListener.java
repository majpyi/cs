import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/*
 * HttpSessionListener实现类
 * sessionCreated() -- 在HttpSession对象被创建后被调用
 * sessionDestroyed() --  -- 在HttpSession对象被销毁前调用
 * HttpSessionEvent -- 事件类对象
 *     该类有getSession()，用来获取当前HttpSession对象，即获取事件源对象
 */
public class MyservletRequestListener implements ServletRequestListener {
    public void requestDestroyed(ServletRequestEvent evt) {
        System.out.println("销毁request对象");
    }

    public void requestInitialized(ServletRequestEvent evt) {
        System.out.println("创建request对象");
    }
}

