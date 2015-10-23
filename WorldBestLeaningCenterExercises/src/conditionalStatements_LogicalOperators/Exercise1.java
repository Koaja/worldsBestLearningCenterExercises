package conditionalStatements_LogicalOperators;

import java.util.Scanner;

/* 
 Exercise 1: Write a Java program that determines a student’s grade.
The program will read three types of scores(quiz, mid-term, and final scores) 
and determine the grade based on the following rules:
-if the average score >=90% =>grade=A
-if the average score >= 70% and <90% => grade=B
-if the average score>=50% and <70% =>grade=C
-if the average score<50% =>grade=F
See the example output below:

Quiz score: 80

Mid-term score: 68

Final score: 90

Your grade is B.
 */

public class Exercise1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		Scanner input = new Scanner (System.in);
		
		float quizScore, midTermScore, finalScore, avgScore;
		
		System.out.println("Enter quiz score");
		quizScore = input.nextInt();
		
		System.out.println("Enter mid-term score");
		midTermScore = input.nextInt();

		System.out.println("Enter final score");
		finalScore = input.nextInt();
	
		avgScore = (quizScore + midTermScore + finalScore) / 3 ;
		
		if(avgScore >= 90){
			System.out.println("Grade A");
		} else if (avgScore >= 70 && avgScore < 90){
			System.out.println("Grade B");
		} else if (avgScore >= 50 && avgScore < 70){
			System.out.println("Grade C");
		} else if (avgScore < 50){
			System.out.println("Grade f");
		}
		System.out.println("Your average score was " + avgScore);
	}
}
