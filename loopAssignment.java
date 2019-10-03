/* 1.)Will print the numbers numbers from 1 to n where n is given by the user
 *  2.) Print all the squares from 1 to n
 *  3.) Print the sum of 2 numbers
 *  4.) Print the sum of all numbers 1 to n
 *      while loop
 *      to while
 *      for loop 
 *      
 */
import java.util.Scanner;
public class loopAssignment{
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int num;
		
		System.out.println("Type number");

		num = scnr.nextInt();

		

		for (int i = 1; i <= num; i++)
		{
			System.out.println(i);
		}


	}
}
