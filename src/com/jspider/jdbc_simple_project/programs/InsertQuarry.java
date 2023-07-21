package com.jspider.jdbc_simple_project.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertQuarry {

	public static void main(String[] args) {
		
		Connection connection =null;
		try {
			//step-1 load or register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step-2 Create connection
			String url ="jdbc:mysql://localhost:3306/javajdbc";
			String user ="root";
			String pass ="root";
			
			connection = DriverManager.getConnection(url,user,pass);
			// step-3 create statement
			Statement st =connection.createStatement();
			
			//step-4 execute Query
			
			String insertQuert ="insert into product(idproduct,name,price) values(103,'susma',50)";
			Boolean resp = st.execute(insertQuert);
			if(resp == false) {
				System.out.println("Data stored .....");
			}else {
				System.out.println("Data is not stored ...");
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
