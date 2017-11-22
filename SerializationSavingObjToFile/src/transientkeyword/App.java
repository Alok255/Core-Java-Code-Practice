package transientkeyword;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class App {

	public static void main(String[] args) {

		Alok alok=new Alok("Alok",11);
		
		
		System.out.println(alok.toString());
		
		try(FileOutputStream fs =new FileOutputStream("alok")){
			
			ObjectOutputStream os=new ObjectOutputStream(fs);
				
				os.writeObject(alok);
				
				os.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
