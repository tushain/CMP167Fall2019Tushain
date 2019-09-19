import java.util.Scanner;

/**
 * 
 * @author Tushain Newman
 * @description This program checks the user age and see if user can drink alcohol
 */
public class Unit4 {
   public static void main(String[]args) {
	   int age;
	   String name;
	   Scanner in = new Scanner(System.in);
	   
	   System.out.println("This program will screen whether or not you're legal to drink alchol");
	   System.out.println("Enter your name: ");
	   name = in.next();
	   System.out.printf("Ok %s, Enter your age: ",name);
	   age =in.nextInt();
	   
	   if (age>=21) {
		   System.out.println("You can drink alchohol");
		   
	   }
	   else {
		   System.out.println("You cant drink alcohol");
	   }
	   
	   
	 
   }
}
