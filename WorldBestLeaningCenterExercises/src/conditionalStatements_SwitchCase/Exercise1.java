package conditionalStatements_SwitchCase;

import java.util.Scanner;

/*
 Exercise 1: 
 Write a Java program to detect key presses.
 If the user pressed number keys( from 0 to 9), 
 the program will tell the number that is pressed, 
 otherwise, program will show "Not allowed". 
 */

public class Exercise1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int m;

		m = input.nextInt();

		switch (m) {
		case 1:
			System.out.println("m = " + m);
			break;
		case 2:
			System.out.println("m = " + m);
			break;
		case 3:
			System.out.println("m = " + m);
			break;
		case 4:
			System.out.println("m = " + m);
			break;
		case 5:
			System.out.println("m = " + m);
			break;
		case 6:
			System.out.println("m = " + m);
			break;
		case 7:
			System.out.println("m = " + m);
			break;
		case 8:
			System.out.println("m = " + m);
			break;
		case 9:
			System.out.println("m = " + m);
			break;
		default:
			System.out.println("Not Allowerd");
		}
	}

}
