package compoundOperators;

import java.util.Scanner;

/*
Exercise 1: Write Java program to allow the user to input two float values 
and then the program adds the two values together. 
The result will be assigned to the first variable.

Enter value a:12.5

The value of a before adding is 12.5.

Enter value b:34.9

The value of a after adding is 47.4.
*/

public class Exercise1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		float a;
		float b;

		System.out.println("enter first number");

		a = input.nextFloat();

		System.out.println("enter second number");

		b = input.nextFloat();

		System.out.println("The value of a = " + (a + b));

	}
}
