/**
 * 
 */

/**
 * @author Alok Raj
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// This method of string builder take lots of memory 
		String info=" ";
		info+="ALok";
		info+=" ";
		info+="Raj";
		info+=" ";
		info+="Singh";
		
		//So we are using this method 
		StringBuilder sb = new StringBuilder();
			sb.append("Alok");
			sb.append(" Raj");
			sb.append(" Singh");
			
			System.out.println(sb.toString() );//Calling StringBuilder
		System.out.println(info);
		

	}

}
