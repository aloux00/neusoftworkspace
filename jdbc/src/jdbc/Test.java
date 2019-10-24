package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Test {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.jdbc.Driver");
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytest","root","admin");
	System.out.println(connection);
	PreparedStatement statement = connection.prepareStatement("select * from emp");
	ResultSet executeQuery = statement.executeQuery();
	while(executeQuery.next()) {
	System.out.println(executeQuery.getObject(1));
	System.out.println(executeQuery.getObject(2));
	System.out.println(executeQuery.getObject(3));
	String s;
JOptionPane.showMessageDialog(null, "null");
	}
}
}
