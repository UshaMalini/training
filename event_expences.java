package training;

import java.util.Scanner;

public class event_expences {
		public static void main(String[] args) {
			int b, t, f, l;
			float total;
			float b2, t2, f2, l2;
			System.out.println("Enter branding expenses");
			b = STDIN_SCANNER.nextInt();
			System.out.println("Enter travel expenses");
			t = STDIN_SCANNER.nextInt();
			System.out.println("Enter food expenses");
			f = STDIN_SCANNER.nextInt();
			System.out.println("Enter logistics expenses");
			l = STDIN_SCANNER.nextInt();
			total = b + t + f + l;
			System.out.printf("Total expenses : Rs.%.2f\n", total);
			b2 = (b / total) * 100;
			System.out.printf("Branding expenses percentage : %.2f%%\n", b2);
			t2 = (t / total) * 100;
			System.out.printf("Travel expenses percentage : %.2f%%\n", t2);
			f2 = (f / total) * 100;
			System.out.printf("Food expenses percentage : %.2f%%\n", f2);
			l2 = (l / total) * 100;
			System.out.printf("Logistics expenses percentage : %.2f%%\n", l2);
		}

		public final static Scanner STDIN_SCANNER = new Scanner(System.in);
	}
