package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import com.model.User;

public class UserJDBC {
	Connection con;
	PreparedStatement ps;
	
	public Connection myConnection(){
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Newuser123");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public int saveData(List<User> ls) {
		int i=0;
		User u = null;
		con = myConnection();
		try {
			Iterator<User> itr = ls.iterator();
			while(itr.hasNext())
			{
				u = itr.next();
				ps = con.prepareStatement("insert into UserServlet values(?,?,?)");
				ps.setInt(1, u.getUno());
				ps.setString(2, u.getName());
				ps.setString(3, u.getPass());
				i = ps.executeUpdate();
			}
			}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return i;
	}
	
}
