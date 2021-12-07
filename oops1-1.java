public class ItemType {
	
	
	private String name;
	private Double costPerDay;
	private Double deposit;
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getCostPerDay() {
		return costPerDay;
	}
	public void setCostPerDay(Double costPerDay) {
		this.costPerDay = costPerDay;
	}
	public Double getDeposit() {
		return deposit;
	}
	public void setDeposit(Double deposit) {
		this.deposit = deposit;
	}
	
    public void display() {
    	System.out.println("name:"+getName());
    	System.out.println("costPerDay:"+String.format("%.2f",getCostPerDay()));
    	System.out.println("deposit: "+String.format("%.2f",getDeposit()));
    }
}


Main.java


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ItemType i=new ItemType();
		System.out.println("enter the itemtypename:");
		i.setName(sc.next());
		System.out.println("enter the costperday:");
		i.setCostPerDay(sc.nextDouble());
		System.out.println("enter the deposit");
		i.setDeposit(sc.nextDouble());
		System.out.println("item type details");
		i.display();
		
		
		

	}
