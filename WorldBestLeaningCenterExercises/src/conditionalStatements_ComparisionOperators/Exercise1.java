package conditionalStatements_ComparisionOperators;

import java.util.Scanner;

/*
Exercise 1: Write Java program to allow the user to input his/her age. 
Then the program will show if the person is eligible to vote. 
A person who is eligible to vote must be older than or equal to 18 years old.

Enter your age: 18

You are eligible to vote.
 */

public class Exercise1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int age;

		age = input.nextInt();

		if (age >= 18) {
			System.out.println("You are eligible to vote");
		} else {
			System.out.println("You are not eligible to vote");
		}
	}

}
