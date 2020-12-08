package com.mthaler.bankapp.dao;

public class DatabaseConnection {
	public static DatabaseConnection getInstance() {
		return new DatabaseConnection();
	}
	
	public void releaseConnection() {
		//-- release the connection
	}
}
