import java.io.Closeable;
import java.util.Scanner;


public class Userdelimiter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "10 tea 20 coffee 30 tea buiscuits";  
	     Scanner s = new Scanner(input).useDelimiter("\\s");  
	     System.out.println(s.nextInt());  
	     System.out.println(s.next());  
	     System.out.println(s.nextInt());  
	     System.out.println(s.next()); 
	     System.out.println(s.nextLine());
	     s.close(); 
	}

}
