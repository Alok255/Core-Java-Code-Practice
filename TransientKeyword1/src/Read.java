import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


public class Read {

	public static void main(String[] args) {

		Person[] person= {new Person("Alok", 2), new Person("Singh", 3), new Person("Raj", 4)};
		
	
		
		try(FileOutputStream fs=new FileOutputStream("Alok.bin")){
			
			@SuppressWarnings("resource")
			ObjectOutputStream os=new ObjectOutputStream(fs);
			
			os.writeObject(person);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				

	}

}
