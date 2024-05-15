package com.JDBCjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insertdatainJDBCfromjava {
	
		public static void main(String[] args) {
			String dbURL = "jdbc:mysql://localhost:3306/company";
			String username = "root";
			String password = "123456";
			 
			try {
			 
			    Connection conn = DriverManager.getConnection(dbURL, username, password);
			    String sql = "INSERT INTO employee(employeename,employeedept,gender,experience) VALUES (?, ?,?,?)";
			    
			    PreparedStatement statement = conn.prepareStatement(sql);
			    statement.setString(1, "MANASA");
			    statement.setString(2, "CSE");
			    statement.setString(3, "female");
			    statement.setString(4, "4 years");
			  
			     
			    int rowsInserted = statement.executeUpdate();
			    if (rowsInserted > 0) {
			        System.out.println("A new user was inserted successfully!");
			    }
			} catch (SQLException ex) {
			    ex.printStackTrace();
			}
		}
}

	
