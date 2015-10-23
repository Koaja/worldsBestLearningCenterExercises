package loops_ForLoops;

/*
 Exercise 1: Write a Java program by using two for loops to produce the output shown below:


*******

******

*****

****

***

**

*

 */
public class Exercise1 {
	public static void main(String[] args) {

		int i, j;
		for (i = 0; i <= 6; i++) {
			for (j = 1; j <= 7 - i; j++)
				System.out.print("*");
			System.out.println("");
		}
	}

}
