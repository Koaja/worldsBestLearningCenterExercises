package loops_ForLoops;

/*
	Exercise 2: 
 Write a Java program by using three for loops to print the following pattern:

1******

12*****

123****

1234***

12345**

123456*

1234567
 */

public class Exercise2 {
	public static void main(String[] args) {

		int i, j, k;

		for (i = 1; i <= 7; i++) {
			for (j = 1; j <= i; ++j)
				System.out.print(j);

			for (k = 7 - i; k >= 1; k--)
				System.out.print("*");

			System.out.println("");
		}

	}
}
