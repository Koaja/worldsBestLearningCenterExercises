package compoundOperators;

import java.util.Scanner;

/*
Exercise 2: Write Java program to allow the user to input the amount of deposit, 
yearly interest rate (percentage), and income tax(percentage). 
Then the program will calculate the amount of interest that the person earns in the year. 
See the example output below:

The amount of deposit: 1000

Yearly interest rate: 7.5%

Income tax rate: 4%

The amount of interest earned in the year:71.0
*/

public class Exercise2 {
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {

		float deposit , rate , tax, interestEarned, taxAmmount;
		
		  Scanner input=new Scanner(System.in);
		  
		  System.out.print("Enter the amount of deposit:");
		  deposit=input.nextFloat();
		  
		  System.out.print("Enter yearly interest rate:");
		  rate=input.nextFloat();
		  
		  interestEarned=deposit*(rate/100); //amount of interest before tax calculation 
		  
		  System.out.print("Enter income tax rate:");
		  tax=input.nextFloat();
		  
		  taxAmmount=interestEarned*(tax/100);
		  
		  interestEarned-=tax; //the final interest earned
		  
		  System.out.println("The interest earned in the year:" + interestEarned);
		
		
	}
}
