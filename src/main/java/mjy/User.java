package mjy;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;

public class User implements HttpSessionActivationListener, java.io.Serializable, HttpSessionBindingListener {
    @Override
    public void sessionWillPassivate(HttpSessionEvent se) {
        System.out.println("啊～我陪session去火星了，地球已经不安全了！");
    }

    @Override
    public void sessionDidActivate(HttpSessionEvent se) {
        System.out.println("啊～我和session一起重返地球了！");
    }

    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        System.out.println("添加");
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        System.out.println("删除");
    }
}