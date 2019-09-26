/**
 * 
 * @author Tushain Newman
 * @description A guessing game
 * @created 9-26-2019
 * 
 *
 */
import java.util.Scanner;
import java.util.Random;
public class GuessGame {
	static Scanner in = new Scanner(System.in);   //In order to use public static void you have to put 'static' infront of this
	static Random rand = new Random();
	
	public static void main(String[] args) {                     //This is the main method
		
		                                                
		System.out.println("Welcome to Guessing 3000");   //Introduce the program
		System.out.println("Wouled you like to play?");
		String answer = in.next();
		while(answer.equalsIgnoreCase("yes")){
		System.out.println("Enter a number from 1-10: ");
		int userNumber = in.nextInt();
		int pcNumber = rand.nextInt(10) + 1;           // '()10 + 1' causes it to be from 1 to 10
		if( userNumber == pcNumber) {
			System.out.println("You won!");
		}
		else {
			System.out.println("You lost!");
			System.out.println("The PC chose "+pcNumber);
		}
		System.out.println("Would you like to play again?");      // This functions as a break;
		answer = in.next();
		}
	}
}
	


