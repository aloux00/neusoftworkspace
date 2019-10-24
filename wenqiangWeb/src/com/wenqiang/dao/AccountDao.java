package com.wenqiang.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.wenqiang.model.Account;
import com.wenqiang.util.jdbcUtils;

public class AccountDao {
	public Account queryAccount(String username,String password) {
		Connection con = jdbcUtils.getCon();
		try {
			PreparedStatement statement = con.prepareStatement("select username,access from account where username=? and password=?");
			statement.setObject(1, username);
			statement.setObject(2, password);
			ResultSet query = statement.executeQuery();
			Account account=null;
			if(query.next()) {
				account=new Account();
				String name=query.getString(1);
				System.out.println(name);
				int access = query.getInt(2);
				account.setUsername(name);
				account.setAccess(access);
			}
			return account;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
return null;
}

	public int insertAccount(Account account) {
		String username = account.getUsername();
		String password = account.getPassword();
		Integer access = account.getAccess();
		Connection con = jdbcUtils.getCon();
		try {
			PreparedStatement statement = con.prepareStatement("insert into account(username,password,access) values(?,?,?)");
			statement.setObject(1, username);
			statement.setObject(2, password);
			statement.setObject(3, access);
			return statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
}
