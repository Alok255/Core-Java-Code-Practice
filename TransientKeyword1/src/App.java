import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;


public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(ObjectInputStream os=new ObjectInputStream(new FileInputStream("Alok.bin"))){
			
		  // Read entire arraylist
        Person[] personList=(Person[])os.readObject();
        

        for(Person person: personList) {
            System.out.println(person);
        }
			
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


}
