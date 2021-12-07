public class Customer {
    String customername;
	String customeremail;
	String customertype;
	String customeraddress;

	public Customer(String customername, String customeremail, String customertype, String customeraddress) {
		super();
		this.customername = customername;
		this.customeremail = customeremail;
		this.customertype = customertype;
		this.customeraddress = customeraddress;
	}
	
	void displayDetails() {
		System.out.println("Name:"+customername);
		System.out.println("email:"+customeremail);
		System.out.println("type:"+customertype);
		System.out.println("Location:"+customeraddress);
	}

}

	

Main.java

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the customer details");
		
		System.out.println("enter the name");
		String customername=sc.next();
		System.out.println("enter te email");
		String customeremail=sc.next();
		System.out.println("enter the type");
		String customertype=sc.next();
		System.out.println("enter the location");
		String customeraddress=sc.next();
		Customer c=new Customer(customername,customeremail,customertype,customeraddress);
		c.displayDetails();
	}

	}