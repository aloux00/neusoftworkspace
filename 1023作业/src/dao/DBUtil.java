package dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {
private static Properties prop =null;
	
	static {
		prop =new Properties();
		InputStream is = DBUtil.class.getClassLoader().getResourceAsStream("dao/db.properties");
	
		
		try {
			//从输入流中读取属性列表
			prop.load(is);
			// 获得数据库的驱动
			String driverName = prop.getProperty("driverName");
			
			//加载驱动
			Class.forName(driverName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//打开连接
	   
	public  static Connection openConnection() {
		
		Connection conn = null;
		//根据key来获得value
		String url = prop.getProperty("url");
		String user = prop.getProperty("user");
		String pwd = prop.getProperty("pwd");
		
		try {
			conn = DriverManager.getConnection(url, user, pwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
		
}
}
