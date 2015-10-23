package conditionalStatements_SwitchCase;

import java.util.Scanner;

/*
 Exercise 2: 
Write a Java program that allows the user to choose the correct answer of a question.
See the example below:

What is the correct way to declare a variable to store an integer value in Java?
a. int 1x=10;
b. int x=10;
c. float x=10.0f;
d. string x="10";
Enter your choice: c
 */

public class Exercise2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.println("What is the correct way to declare a variable to store an integer value in Java?");

		System.out.println("a. int 1x=10;");
		System.out.println("b. int x=10;");
		System.out.println("c. float x=10f;");
		System.out.println("d. string x=10;");
		System.out.print("Enter your choice: ");

		Scanner input = new Scanner(System.in);

		String ans = input.nextLine();

		switch (ans) {
		case "a":
			System.out.println("Wrong");
			break;
		case "b":
			System.out.println("Correct");
			break;
		case "c":
			System.out.println("Wrong");
			break;
		case "d":
			System.out.println("wrong");
			break;
		default:
			System.out.println("Not an option");
		}
	}

}
