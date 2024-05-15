package com.JDBCjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class updatedata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbURL="jdbc:mysql://localhost:3306/company";
		String username="root";
		String password="123456";
		try
		{
			Connection conn=DriverManager.getConnection(dbURL,username,password);
			String sql="UPDATE employee SET employeename=?,employeedept=?,gender=?,experience=? WHERE employeeid=?";
			PreparedStatement statement = conn.prepareStatement(sql);
		    statement.setString(1, "MANASA");
		   statement.setString(2, "CSE");
		   statement.setString(3, "FEMALE");
		   statement.setString(4, "5 YEARS");
		   statement.setInt(5, 1);
		  
		     
		    int rowsUpdated = statement.executeUpdate();
		    if (rowsUpdated > 0) {
		        System.out.println("An existing user was updated successfully!");
		    }
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
	}

	


		}

	


