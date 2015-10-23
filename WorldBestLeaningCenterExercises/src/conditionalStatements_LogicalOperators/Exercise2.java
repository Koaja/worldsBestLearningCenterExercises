package conditionalStatements_LogicalOperators;

import java.util.Scanner;

/*
Exercise 2: Write a Java program to calculate the revenue from a sale 
based on the unit price and quantity of a product input by the user.
The discount rate is 10% for the quantity purchased between 100 and 120 units, 
and 15% for the quantity purchased greater than 120 units. 
If the quantity purchased is less than 100 units, the discount rate is 0%. 
See the example output as shown below:

Enter unit price: 25

Enter quantity: 110

The revenue from sale: 2475.0$

After discount: 275.0$(10.0%)
 */

public class Exercise2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		float revenue = 0f;
		float unitPrice = 0f;
		int quantity = 0;
		float discountRate = 0f;
		float discountAmount = 0f;

		System.out.println("enter unit price");
		unitPrice = input.nextFloat();

		System.out.println("enter quantity");
		quantity = input.nextInt();

		if (quantity >= 100 && quantity <= 120) {
			discountRate = (float) 10 / 100;
			revenue = unitPrice * quantity;
			discountAmount = revenue * discountRate;
			revenue -= discountAmount;
		} else if (quantity >= 120) {
			discountRate = (float)15 / 100;
			revenue = unitPrice * quantity;
			discountAmount = revenue * discountRate;
			revenue -= discountAmount;
		} else {
			revenue = unitPrice * quantity;
		}
		System.out.println("The revenue from sale:" + revenue + "$");
		System.out.println("After discount:" + discountAmount + "$(" + discountRate * 100 + "%)");
	}
}
