import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class App {
	
	public static void main(String[] args) throws FileNotFoundException {
		//String fileName = "C:/Users/Alok Raj/workspace/FileReading/src/message.txt";
		String fileName="message.txt";
		
		File textFile = new File(fileName);
			Scanner in = new Scanner(textFile);
			
			int value=in.nextInt();
			
			System.out.println("Read Value " + value);
			//Count Text Line in
			int txtLine=1;
		while(in.hasNextLine()){
			String line = in.nextLine();
			System.out.println(line);
			
			txtLine++;
		}
		in.close();
			System.out.println("\nThe line in Note Pade : " + txtLine);
			
	}
}
