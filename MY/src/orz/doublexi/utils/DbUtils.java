package orz.doublexi.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtils {
    static{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection getCon(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/mydb?serverTimezone=GMT", "root", "admin");

        } catch (SQLException e) {
          System.out.println("哎呀，没获取到呀");
        }

        return null;

    }

    public static void  close(Connection con) throws SQLException {
        if (con.isClosed()|con==null) {
            return;
        }
        con.close();
    }
}
