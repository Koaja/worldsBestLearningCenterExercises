package arithmeticOperations;

import java.util.Scanner;

/*
Exercise 1: Write Java program to allow the user to input two integer values 
and then the program prints the results of adding, subtracting, multiplying, and dividing among the two values.

See the example below:
Enter value a:30

Enter value b:10

The result of adding is 40.

The result of subtracting is 20;

The result of multiplying is 300.

The result of dividing is 3.
 */

public class Exercise1 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter first number");
		
		int n1 = input.nextInt();
		
		System.out.println("enter second number");
		
		int n2 = input.nextInt();
		
		System.out.println(n1 + n2);
		System.out.println(n1 - n2);
		System.out.println(n1 * n2);
		System.out.println(n1 / n2);
	}

}
