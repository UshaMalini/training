package training;

import java.util.Scanner;

public class Archery {
  static int count;
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int target=150;
	int sum=0;
	for(int i=0;i<target;i++) {
		System.out.println("enter points :");
		int turn=sc.nextInt();
		System.out.println("Turn"+(i+1)+":"+turn);
		sum=sum+turn;
		count++;
		if(sum>=100) {
			System.out.println("number of turns:"+count);
		}
	}
}
}
