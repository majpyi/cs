import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtils1 {
    static Connection con = null;
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3306/demo?serverTimezone=GMT%2B8";
            String user = "root";
            String passwd = "123";
            con = DriverManager.getConnection(url,user,passwd);
            DataSource ds = new ComboPooledDataSource();
            con = ds.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        getConnection();
    }
    static Connection getConnection(){
        return con;
    }

    static void releaseConnection() throws SQLException {
        con.close();
    }
}
