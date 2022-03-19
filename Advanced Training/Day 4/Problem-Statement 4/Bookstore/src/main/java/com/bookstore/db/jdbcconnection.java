package com.bookstore.db;

import java.sql.DriverManager;

import org.eclipse.jdt.internal.compiler.ast.ReturnStatement;

import com.mysql.jdbc.Connection;

public class jdbcconnection {
	private static Connection con;
	
	public static Connection getConnection() {
		try {
			if(con==null) {
				Class.forName("com.mysql.jdbc.Driver");
				con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root","");
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return con;
	}
	
}
