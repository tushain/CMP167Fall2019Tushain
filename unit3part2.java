import java.util.Scanner;

public class unit3part2 {
 public static void main(String[] arg) {
	 String myWords = "Sara 45 Cruz";
	 Scanner in = new Scanner(myWords);
	 
	 String name = in.next();
	 int age = in.nextInt();
	 String lastname = in.next();
	 
	 System.out.printf("%s is %d years old",name,age);
	 
 }
}
