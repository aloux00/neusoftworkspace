import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Driver;

public class JdbcPractice {
public static Connection getc() {
	try {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytest","root","admin");
		return conn;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return null;
}
	public static void main(String [] args) throws Exception {
//		Class.forName("com.mysql.jdbc.Driver");
		
		PreparedStatement pstm = getc().prepareStatement("select * from emp");
		ResultSet set = pstm.executeQuery();
		while (set.next()) {
System.out.println(set.getObject(1));			
System.out.println(set.getObject(2));			
System.out.println(set.getObject(3));			
System.out.println(set.getObject(4));			
System.out.println(set.getObject(5));			
System.out.println(set.getObject(6));			
		}
		
}
}
