package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student("Alok ", 003);
		Student student2 =new Student("Pintu ", 188);
		
		System.out.println(student + " " +student2);
		try(FileOutputStream fs=new FileOutputStream("student1")){
			
			ObjectOutputStream os=new ObjectOutputStream(fs);
			
			os.writeObject(student2);
			os.writeObject(student);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
