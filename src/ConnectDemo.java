import java.sql.*;
import java.util.Scanner;
public class ConnectDemo {
	
	static Connection con=null;
	static Statement stmt=null;
	static ResultSet rs=null;
public static void main(String[]args) {
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");
				
				Statement stmt=con.createStatement();
				Scanner sc= new Scanner(System.in);
				System.out.println("Enter DeptInfo (No, Name and Loc");
				int deptno=sc.nextInt();
				String dname= sc.next();
				String loca= sc.next();
				int res=stmt.executeUpdate("insert into department values("+deptno+",'"+dname+"','"+loca+"')");
				System.out.println("New row added..");
				
				ResultSet rs= stmt.executeQuery("select * from Department");
				
				while (rs.next()) {
					System.out.println(rs.getString(1) +" " +rs.getString(2)+ " "+rs.getString(3));
				
				}
	}
	catch(SQLException e) {
		System.out.println(e.getMessage());
	}
	catch(ClassNotFoundException e) {
		System.out.println(e.getMessage());
	}
	finally
	{
		try {
		rs.close();
		stmt.close();
		con.close();
	}
		catch(Exception e) {
}
}
}
}