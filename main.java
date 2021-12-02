package training;

import java.util.Scanner;

public class main {
	static int n,a=3;
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	for(int i=0;i<n;i++) {
		System.out.println((a)+" ");
		a=a*3;
	}
}
}
