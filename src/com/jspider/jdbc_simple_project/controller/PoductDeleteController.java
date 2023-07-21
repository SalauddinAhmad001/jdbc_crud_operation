package com.jspider.jdbc_simple_project.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PoductDeleteController {

	public static void main(String[] args) {
		
	/*	Connection connection=null;
		try {
			
			//step-1 load/register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step-2 Create Connection
			
			String url="jdbc:mysql://localhost:3306/jdbc-preparedstatement";
			String user="root";
			String pass="root";
			
			connection=DriverManager.getConnection(url,user,pass);
			//Step-3  Create statement
			String updateColorQuery="update product set productcolor = ? where productid=?";
			PreparedStatement.setInt(1,100);
			
			int a=preparedStatement.executeUpdate();
			if(a==1) {
				System.out.println("Data is Deleted");
			}else {
				System.err.println("Given id is not present ");
			}
			
			
		} catch (Exception e) {

			e.printStackTrace();
		}finally {
			try {
				
			} catch (SQLException e2) {

				connection.close();
			}
		}
	*/	
	}
}
