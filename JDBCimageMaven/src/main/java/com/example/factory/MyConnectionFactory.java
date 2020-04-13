package com.example.factory;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnectionFactory {

	private static Connection connection;
	private static MyConnectionFactory factory;

	// singletone design pattern
	private MyConnectionFactory() {
		try {
			
			//DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Shyam@1263");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public  Connection getMyConnection() throws SQLException {
		return connection;
	}

	public static MyConnectionFactory getConnectionObject() {
		if (factory == null) {
			factory = new MyConnectionFactory();
		}
		return factory;
	}

}
