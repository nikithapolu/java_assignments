package com.demo;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;


public class AddBook {
		
		public static void main(String[] args) {
			//1. u need to load the driver
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("driver is loaded..");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			PreparedStatement stmt=null;
			Connection connection=null;
			
			try {
				 connection=DriverManager.getConnection
						("jdbc:mysql://localhost:3306/bookstore", "book", "book");
				
				stmt=connection.
						prepareStatement("insert into book(book_id, book_name, book_author, book_price) values(?,?,?,?)");
				
				stmt.setInt(1, 10006);
				stmt.setString(2, "Making of New India");
				stmt.setString(3, "Dr. Bibek Debroy");
				stmt.setInt(4, 700);
				
				int noOfRowsEffected= stmt.executeUpdate();
				System.out.println(noOfRowsEffected);
				
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				if(connection!=null) {
					try {
						connection.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
			
			
		}

	}

	
	

