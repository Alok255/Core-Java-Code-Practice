package demo4;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		openFile();
		}catch(FileNotFoundException e){
			System.out.println("File Not Found Error !" + e);
		}
		
	}
	
	public static void openFile() throws FileNotFoundException{
		File file=new File("Test.txt");
		FileReader fr =new FileReader(file);
		
		
		
	}

}
