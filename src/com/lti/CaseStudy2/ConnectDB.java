package com.lti.CaseStudy2;
import java.sql.*;
public class ConnectDB {
static Connection conn= null;
public static Connection connDB() throws ClassNotFoundException{
	
	Class.forName("oracle.jdbc.OracleDriver");
	String username= "system";
	String password= "oracle";
	
	try {
		conn= DriverManager.getConnection("jdbc:oracle:thin:"+username+"/"+password+"@localhost:1521:xe");
	
	}
	catch(Exception e) {
		System.out.println("Connection Error"+e.getMessage());
	}
	return conn;
}
}
