package training;

import java.util.Scanner;

public class Choclate {
static int count=0;
public static void main(String[] args) {
	int choclates;
	int children;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter no of choclates");
    choclates=sc.nextInt();
    System.out.println("enter no of children");
    children=sc.nextInt();
    for(int i=1;i<=children;i++) {
    	if(choclates>=i) {
    		choclates=choclates-i;
    		count++;
    	}
    }
    System.out.println("choclates remaining"+choclates);
    System.out.println("no of children got choclate"+count);
    
}
}
