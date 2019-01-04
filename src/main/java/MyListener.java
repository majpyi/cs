import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class MyListener implements ServletContextAttributeListener,
        ServletRequestAttributeListener, HttpSessionAttributeListener {
    public void attributeAdded(HttpSessionBindingEvent evt) {
        System.out.println("向session中添加属性：" + evt.getName() + "=" + evt.getValue());
    }

    public void attributeRemoved(HttpSessionBindingEvent evt) {
        System.out.println("从session中移除属性：" + evt.getName() + "=" + evt.getValue());
    }

    public void attributeReplaced(HttpSessionBindingEvent evt) {
        System.out.println("修改session中的属性：" + evt.getName() + "=" + evt.getValue());
    }

    public void attributeAdded(ServletRequestAttributeEvent evt) {
        System.out.println("向request中添加属性：" + evt.getName() + "=" + evt.getValue());
    }

    public void attributeRemoved(ServletRequestAttributeEvent evt) {
        System.out.println("从request中移除属性：" + evt.getName() + "=" + evt.getValue());
    }

    public void attributeReplaced(ServletRequestAttributeEvent evt) {
        System.out.println("修改request中的属性：" + evt.getName() + "=" + evt.getValue());
    }

    public void attributeAdded(ServletContextAttributeEvent evt) {
        System.out.println("向context中添加属性：" + evt.getName() + "=" + evt.getValue());
    }

    public void attributeRemoved(ServletContextAttributeEvent evt) {
        System.out.println("从context中移除属性：" + evt.getName() + "=" + evt.getValue());
    }

    public void attributeReplaced(ServletContextAttributeEvent evt) {
        System.out.println("修改context中的属性：" + evt.getName() + "=" + evt.getValue());
    }
}
