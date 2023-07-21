package com.jspider.jdbc_simple_project.controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class insertQuery
{
	public static void main(String[] args) {
		Connection connection=null;
		
		try {
			//step-1 load/ragister driver
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step-2 create connection
			
			String url="jdbc:mysql://localhost:3306/javajdbc";
			String user="root";
			String pass="root";
			connection =DriverManager.getConnection(url,user,pass);
		    
		    //step-3 create statement
			
		    Statement statement=connection.createStatement();
		    
		    //step-4 Execute Query
		    
		    String insertQuert ="insert into product (idproduct,name,price) values(102,'marker',30)";
		    statement.execute(insertQuert);
		    System.out.println(insertQuert);
		    System.out.println("Data=====inserted=======");
			
		}
		catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}finally {
			
			try {
				//step-5 close the connection
				if(connection!=null) {
					connection.close();
				}else {
					System.out.println("Please stablish the connection");
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
