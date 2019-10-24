
package com.neusoft.system.db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.util.ResourceBundle;



public class DBUtils 
{
	private DBUtils() {}

	private static String driver=null;

	private static String url=null;

	private static String userName=null;

	private static String password=null;
	
	private static final ThreadLocal<Connection> threadLocal=new  ThreadLocal<>();
//***********************静态初始化****************************
	static
	{
		System.out.println("run  static block......");
		try 
		{
		
			ResourceBundle bundle=ResourceBundle.getBundle("DBOptions");
		
			driver=bundle.getString("DRIVER");
			url=bundle.getString("URL");
			userName=bundle.getString("USERNAME");
			password=bundle.getString("PASSWORD");
			
			
			Class.forName(driver);
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
	
	
	//************************事务处理**********************************
	public static void beginTransation() throws Exception{
		DBUtils.getConnection().setAutoCommit(false);
		
	}
	
	public static void commit() throws Exception{
		DBUtils.getConnection().commit();
	}
	
	public static void rollback(){
		try{
			DBUtils.getConnection().rollback();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		}
	
	public static void endTransaction(){
		try {
			DBUtils.getConnection().setAutoCommit(true);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	//*********************Connection创建方法********************************
	private static Connection getConnection() throws Exception{
		Connection conn=threadLocal.get();
		if(conn==null||conn.isClosed()){
			conn=DriverManager.getConnection(url,userName,password);
			threadLocal.set(conn);
		}
		return conn;
	}
	
	
//	public static Connection getConnection()throws Exception
//	{
//		Connection conn=DriverManager.getConnection(url, userName, password);
//		return conn;
//	} 
	//***********************SQL编译方法**********************************
	public static PreparedStatement preparedStatement(String sql) throws Exception{
		return DBUtils.getConnection().prepareStatement(sql);
	}
	
	
	//**********************资源销毁***********************************
	public static void close(ResultSet rs){
		try {
			if(rs!=null)
				rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void close(){
		try {
			Connection conn=threadLocal.get();
			if(conn!=null&&!conn.isClosed())
			{
				System.out.println("connection close");
			threadLocal.remove();
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void close(PreparedStatement pstm){
		try {
			if(pstm!=null)
				pstm.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{
		try 
		{
			for(int i=0;i<10;i++)
			{
				System.out.println(DBUtils.getConnection());	
			}
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}

}









