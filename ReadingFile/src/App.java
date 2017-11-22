import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class App {

	public static void main(String[] src){
		
		String newFile="test.txt";
		
		File file=new File(newFile);
		BufferedReader bf=null;
		try{
			FileReader fr=new FileReader(file);
			
			bf = new BufferedReader(fr);
			
			String line;
			
			while((line=bf.readLine()) !=null){
				System.out.println(line);
			}
			
		
		}catch(FileNotFoundException e){
			System.out.println("File not found :" + file.toString());
		} catch (IOException e) {
			System.out.println(e);
		}
		
		finally{
			try {
				bf.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
