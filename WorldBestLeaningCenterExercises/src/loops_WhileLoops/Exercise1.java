package loops_WhileLoops;

import java.util.Scanner;

/*
Exercise 1: Write Java program to prompt the user to choose the correct answer from a list of answer choices of a question.
The user can choose to continue answering the question or stop answering it. See the example below:
What is the command keyword to exit a loop in Java?

a. int

b. continue

c. break

d. exit

Enter your choice: b

Incorrect!

Again? press y to continue:
 */

public class Exercise1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String ans, repeat;

		while (true) {
			System.out.println("What is the command keyword to exit a loop in Java?");
			System.out.println();
			System.out.println("a. int");
			System.out.println("b. continue");
			System.out.println("c. break");
			System.out.println("d. exit");

			System.out.println("Enter your choice: ");
			ans = input.nextLine();

			if (ans.equals("c")) {
				System.out.println("Correct");
				break;
			} else {
				System.out.println("Incorrect");
			}
			System.out.println("Again ? press y to continue");

			repeat = input.nextLine();

			if (repeat.equals("y")) {
				continue;
			} else {
				break;
			}
		}
	}

}
