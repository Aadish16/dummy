package com.lti.pms;

import java.sql.SQLException;
import java.util.Scanner;

public class app1 {
	void screen() throws ClassNotFoundException, SQLException {
		System.out.println("WELCOME TO PMS");
		System.out.println("1. Products");
		System.out.println("2. Sales");
		System.out.println("3. EXIT");
		AppEngine app = new AppEngine();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		while(! input.equals("3")) {
			
			if (input.equals("1")) {
				System.out.println("Enter 1 for Reg Products");
				System.out.println("Enter 2 for DEl Product");
				System.out.println("Enter 3 for Update Product");
				String input1 = sc.next();
				if(input1.equals("1")) {
					System.out.println("Enter product Id ");
					int id = sc.nextInt();
					System.out.println("Enter product Name ");
					String name = sc.next();
					System.out.println("Enter product Price ");
					int price = sc.nextInt();
					System.out.println("Enter product Quantity ");
					int qty = sc.nextInt();
					Product product = new Product(id,name,price,qty);
					
					app.regProduct(product);
				}
				
				if(input1.equals("2")) {
					System.out.println("Enter product Id ");
					int id = sc.nextInt();
					app.delProduct(id);
				}
				
				if(input1.equals("3")) {
					System.out.println("Enter product Id ");
					int id = sc.nextInt();
					System.out.println("Enter product Quantity ");
					int qty = sc.nextInt();
					app.updateProduct(id,qty);
				}
			}
			if(input.equals("2")) {
				System.out.println("Enter product Id ");
				int id = sc.nextInt();
				System.out.println("Enter product quantity ");
				int qty = sc.nextInt();
				app.updateProduct(id,qty);
			}
		}
		
	}
	
	public static void main (String[ ] Args) throws ClassNotFoundException, SQLException {
	app1 app = new app1();
	app.screen();
	}
}

