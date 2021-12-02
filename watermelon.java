package training;

import java.util.Scanner;

public class Watermelon {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter watermelon weight:");
	int watermelon=sc.nextInt();
	if(watermelon%2==0) {
		System.out.println("\n for me"+watermelon/2+"kgs and for my sibling"+watermelon/2+"kgs\n");
	}
	else {
		System.out.println("sorry you cant buy,look for even weight watermelon");
		
	}
	for(int i=1;i<watermelon;i++) {
		System.out.println("possible ways of splitting"+i+" "+(watermelon-i));
	}
}
}
