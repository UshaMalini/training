public class Address {
	
	private String street;
	private String city;
	private int pincode;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String street, String city, int pincode) {
		super();
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return (street+","+city+"-"+pincode);
	}

	
}


Customer.java


public class Customer {
	
	String name;
	Address address;
	public Customer1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer1(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return (name + address);
	}
	
	

}

Main.java


import java.util.Scanner;

public class Main {
	
	

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String name=sc.next();
		System.out.println("enter the address details");
		System.out.println("enter the street");
		String street=sc.next();
		System.out.println("enter the city");
		String city=sc.next();
		System.out.println("enter the pincode");
		int pincode=sc.nextInt();
		Address a=new Address(street,city,pincode);
		Customer1 c1=new Customer1(name,a);
		String customerdetails=c1.toString();
		System.out.println(customerdetails);
	}

}
