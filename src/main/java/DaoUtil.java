import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;

public class DaoUtil {
    public static void main(String[] args) throws Exception{
        Connection con = JdbcUtils1.getConnection();
        con.setAutoCommit(false);
        QueryRunner qr =  new QueryRunner();
        String sql = "select * from xuesheng";
//        Object[] params = null;
//        ResultSetHandler re = new ArrayHandler();
        System.out.println(qr.query(con,sql,new BeanListHandler<xuesheng>(xuesheng.class)));
        con.close();
    }
}
