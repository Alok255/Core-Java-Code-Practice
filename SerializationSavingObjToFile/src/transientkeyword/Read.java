package transientkeyword;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Read {

	public static void main(String[] args) {


		try(FileInputStream fs=new FileInputStream("alok")){
			
			ObjectInputStream os=new ObjectInputStream(fs);
			
			Alok[] alok=(Alok[])os.readObject();
			System.out.println(alok[1]);
			/*
			ArrayList<Alok> alokList =(ArrayList<Alok>)os.readObject();
			 
			//Alok[] alok=(Alok[])os.readObject();
			for(Alok a : alokList){
				System.out.println(a);
			}
			*/
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
