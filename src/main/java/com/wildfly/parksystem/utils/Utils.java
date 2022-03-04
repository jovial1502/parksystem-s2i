package com.wildfly.parksystem.utils;

import java.sql.Connection;
import java.sql.DriverManager;


public abstract class Utils {
	
	public static final String URL = "jdbc:mysql://" + System.getenv("PARKSYSTEM_DB_SERVICE_HOST") + ":3306/";
	public static final String DBNAME="parking_system_db";
	public static final String USER="user1";
	public static final String PWD="mypa55";
	public static final String DRIVER="com.mysql.cj.jdbc.Driver";
	
	public static final Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(URL+DBNAME,USER,PWD);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print("Unable to get connection to the database");
			e.printStackTrace();
		}
		return con;		 
	}

}
