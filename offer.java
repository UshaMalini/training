package training;

import java.util.Scanner;

public class Offer {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter 1st product price :");
	int p1=sc.nextInt();
	System.out.println("enter 2nd product price:");
	int p2=sc.nextInt();
	System.out.println("enter 3nd product price:");
	int p3=sc.nextInt();
	int sum=p1+p2+p3;
	double offer1=sum*0.20;
	int offer2;
	if(p1<p2 && p1<p3) {
		offer2=p1;
	}else if(p2<p3) {
		offer2=p2;
	}else {
		offer2=p3;
	}
	if(offer1>offer2) {
		System.out.printf("offer1 is best for customer:"+"%.2f",offer1);
		
	}else {
		System.out.println("offer2 is best for customer:"+offer2);
	}
}
}
