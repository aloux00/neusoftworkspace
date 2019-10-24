package com.wenqiang.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class jdbcUtils {
private jdbcUtils(){}
private static final ThreadLocal<Connection> threadlocal=new ThreadLocal<>();
static{
	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public static Connection getCon(){
		Connection connection = threadlocal.get();
		if(connection!=null) {
			return connection;
		}
		else {
			try {
				connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/wenqiang?characterEncoding=utf-8", "root", "admin");
				return connection;
			} catch (SQLException e) {
				e.printStackTrace();
			return null;
			}
		}
	}


public static void close(ResultSet rs){
	try {
		if(rs!=null)
			rs.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
public static void close(Connection conn){
	try {
		if(conn!=null&&!conn.isClosed()){
			
			conn.close();
		
	}
	
	}catch (Exception e) {
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
public static void main(String[] args) {
System.out.println(getCon());
}
}
