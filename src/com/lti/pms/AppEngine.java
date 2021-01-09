package com.lti.pms;

	 import java.sql.*;
	 
	 public class AppEngine {
		 public void regProduct(Product product) throws SQLException,ClassNotFoundException {
			 String command = "insert into Product values(?,?,?,?)";
	         PreparedStatement ps =null;
	         Connection conn = null;
	         try {
	        	 
	       	  conn =new ConnectDB().connDB();
	       	  ps = conn.prepareStatement(command);
		          ps.setInt(1, product.getProductID() );
		          ps.setString(2,product.getProductName());
		          ps.setInt(3,product.getPrice());
		          ps.setInt(4,product.getQty());
		          ps.executeUpdate();
		          System.out.println("Product registered");
			 }
	         catch(SQLException e) {
	       	  System.out.print("ID exists");
	         }
	         catch(ClassNotFoundException e) {
	       	  System.out.print(e.getMessage());
	         }
	         finally {
	       	  if(ps!=null)
	       		  ps.close();
	       	  if(conn!=null)
	       		  conn.close();
	         }
		 }
		 
		 public void delProduct(int id) throws SQLException,ClassNotFoundException {
			 String command = "DELETE FROM Product where ProdId = ?";
	         PreparedStatement ps =null;
	         Connection conn = null;
	         try {
	       	  conn = new ConnectDB().connDB();
	       	  ps = conn.prepareStatement(command);
		          ps.setInt(1, id);
		          ps.executeUpdate();
		          System.out.println("Product Deleted");
			 }
	         catch(SQLException e) {
	       	  System.out.print("ID exists");
	         }
	         catch(ClassNotFoundException e) {
	       	  System.out.print(e.getMessage());
	         }
	         finally {
	       	  if(ps!=null)
	       		  ps.close();
	       	  if(conn!=null)
	       		  conn.close();
	         }
			 
		 }
		 
		 public void updateProduct(int id,int qty) throws SQLException, ClassNotFoundException {
			 String command = "Update Product Set qty = ? where ProdId = ?";
	         PreparedStatement ps =null;
	         Connection conn = null;
	         try {
	       	  conn = new ConnectDB().connDB();
	       	  ps = conn.prepareStatement(command);
	       	  ps.setInt(1, qty );    
	       	  ps.setInt(2, id );
		         ps.executeUpdate();
		         System.out.println("Product Updated");
			 }
	         catch(SQLException e) {
	       	  System.out.print("ID exists");
	         }
	         catch(ClassNotFoundException e) {
	       	  System.out.print(e.getMessage());
	         }
	         finally {
	       	  if(ps!=null)
	       		  ps.close();
	       	  if(conn!=null)
	       		  conn.close();
	         }

		 }
		 
		 public void salesInfo(int prodId, int qty) throws SQLException, ClassNotFoundException {
			 String insertQuery =  "insert into Sales values(SELECT ?,?,?,(price*?) FROM PRODUCT where prodID = ?)";
	         PreparedStatement ps =null;
	         Connection conn = null;
	         try {
	       	  conn = new ConnectDB().connDB();
	       	  ps = conn.prepareStatement(insertQuery);

	       	  ps.setInt(1, qty+prodId );    
	       	  ps.setInt(2, prodId );
	       	  ps.setInt(3, qty );
	       	  ps.setInt(4, qty );
	       	  ps.executeUpdate();
	       	System.out.println("Sales Info Updated");
			 }
	         catch(SQLException e) {
	       	  System.out.print("ID exists");
	         }
	         catch(ClassNotFoundException e) {
	       	  System.out.print(e.getMessage());
	         }
	         finally {
	       	  if(ps!=null)
	       		  ps.close();
	       	  if(conn!=null)
	       		  conn.close();
	         }
			 
		 }
	 }

