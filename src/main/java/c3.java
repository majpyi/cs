import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

public class c3 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, PropertyVetoException {
        ComboPooledDataSource x = new ComboPooledDataSource();
//        x.setDriverClass("com.mysql.jdbc.Driver");
//        x.setJdbcUrl("jdbc:mysql://localhost:3306?serverTimezone=UTC");
//        x.setUser("root");
//        x.setPassword("123");
//        Class.forName("com.mysql.jdbc.Driver");
        Connection con = x.getConnection();
        System.out.println(con);
//        if (con != null) {
//            con.close();
//        }
    }
}
