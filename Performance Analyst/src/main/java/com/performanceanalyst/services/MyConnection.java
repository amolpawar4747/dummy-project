package com.performanceanalyst.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	private Connection con=null;
	
	public Connection myConnect()
	{
		try {
			if(con==null || con.isClosed())
			{
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demologin","Abhi","abhi@19");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		return con;
	}
	
}
