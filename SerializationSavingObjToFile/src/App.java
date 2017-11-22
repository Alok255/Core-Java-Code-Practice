import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;


public class App {

	public static void main(String[] args) {
		
		//Create Object Array
		Person[] people = {new Person("Sue", 1), new Person("Mike", 99), new Person("Bob", 7)};
        
        ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));
		try(FileOutputStream fs =new FileOutputStream("person.bin")){
				
			ObjectOutputStream os= new ObjectOutputStream(fs);
				
				//os.writeObject(person);
				
				//Now write ArrayList
				// Write arraylist
	            os.writeObject(peopleList);
				 
				 
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
				

	}

}
