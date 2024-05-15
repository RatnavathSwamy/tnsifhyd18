package com.JDBCjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class deletedata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbURL = "jdbc:mysql://localhost:3306/company";
		String username = "root";
		String password = "123456";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		    String sql = "DELETE FROM employee WHERE employeeid=?";
		    
		    PreparedStatement statement = conn.prepareStatement(sql);
		    statement.setInt(1, 33);
		     
		    int rowsDeleted = statement.executeUpdate();
		    if (rowsDeleted > 0) {
		        System.out.println("A user was deleted successfully!");
		    }
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
	}

	}


