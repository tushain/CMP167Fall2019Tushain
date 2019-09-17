import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Scanner;
public class Task {
	public static void main (String[] arg){
		
		
		
		 StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
				pw.print("Tushain Newman is the Goat.");
				String name = sw.toString(); 
				System.out.println("The truth is");
				System.out.print(name);
				
		Scanner in = new Scanner(name);
		System.out.print(in.next());

				 
	}
	

}
