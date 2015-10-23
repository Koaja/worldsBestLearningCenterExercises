package arithmeticOperations;

import java.util.Random;

/*
Exercise Exercise 2: Write Java program to generate a random number between 1 to 6.
To generate a random number, you can use the Random class of java.util package. 
You may use the abs() method of Math class to make sure you can get only a positive number.
*/

public class Exercise2 {

	public static void main(String[] args) {

		Random rnd = new Random();

		int number = 1 + Math.abs(rnd.nextInt() % 6);

		int number2 = 1 + rnd.nextInt(6);

		System.out.println(number);
		System.out.println(number2);

	}
}
