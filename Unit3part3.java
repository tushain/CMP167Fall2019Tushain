
import java.io.PrintWriter;
import java.io.StringWriter;

public class Unit3part3 {
 public static void main(String[] arg) {
	 StringWriter sw = new StringWriter();
	 PrintWriter pw = new PrintWriter(sw);
	 
	 pw.print("Ana Katherina");
	 String name = sw.toString();
	 
	 System.out.println(name);;
	 
	 
			 
 }
}
