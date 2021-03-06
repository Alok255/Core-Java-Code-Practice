import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;


public class Readobj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(FileInputStream sr =new FileInputStream("person.bin")){
			
		ObjectInputStream os=new ObjectInputStream(sr);
		
		  // Read entire arraylist
        @SuppressWarnings("unchecked")
        ArrayList<Person> peopleList = (ArrayList<Person>)os.readObject();
        

        for(Person person: peopleList) {
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
