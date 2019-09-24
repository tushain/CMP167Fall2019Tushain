/**
 * 
 * @author Tushain Newman
 *
 */
import java.util.Scanner;
public class SuperMarket 
{
     public static void main(String[] args) {
    	 Scanner in = new Scanner(System.in);
    	 String answer;
    	 double budget;
    	 
    	 System.out.println("Welcome to Yani's SuperMarket");
    	 System.out.print("Would you like to see the inventory?");
    	 answer =in.next();
    	 if (answer.equalsIgnoreCase("yes")) {
    		 System.out.printf("1.%s %n 2.%s %n"
    				 + "3.%s", "Pringles", "Prosecco", "Mozzarella Sticks");
    		 System.out.println("Would you like to buy something? 1 2 3 0");
    		 int choice= in.nextInt();
    		 switch(choice) {
    		 case 1:
    			 System.out.println("You selected Pringles");
    			 System.out.println("That's $2.99");
    			 
    			 break;
    		 case 2:
    			 System.out.println("You selected Procecco");
    			 System.out.println("That's $99.99");
    		 case 3:
    			 System.out.println("Mozarella Sticks");
    			 System.out.println("That's $9.99");
    			 
    		 
    		 
    		 }
    	 }
	
	
	
	
}
}