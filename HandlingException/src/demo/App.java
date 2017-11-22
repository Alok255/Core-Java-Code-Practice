package demo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class App {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File("text1.txt");
		
		FileReader fileReader = new FileReader(file);

	}

}
