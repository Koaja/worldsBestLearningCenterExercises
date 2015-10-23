package conditionalStatements_ComparisionOperators;

import java.util.Scanner;

/*
Exercise 2: Write a Java program to determine whether an input number is an even number.
*/

public class Exercise2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int a;
		a = input.nextInt();
		if	(a % 2 == 0){
			System.out.println(a + " is an even number");
		}else {
			System.out.println(a + " is not an even number");
		}
			
	}
}
