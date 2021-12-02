package training;

import java.util.Scanner;

public class weekSalary {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int total=0,wd,we;
	System.out.println("enter the total salary paid:");
	total=sc.nextInt();
	we=(total-800)/130;
	wd=we+10;
	System.out.println("number of weekday hour is"+wd);
	System.out.println("number of weekend hour is"+we);
}
}
