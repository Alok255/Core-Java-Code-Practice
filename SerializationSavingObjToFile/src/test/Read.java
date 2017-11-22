package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Read {

	public static void main(String[] args) {

		try(FileInputStream fs=new FileInputStream("student1")){
			
		ObjectInputStream os=new ObjectInputStream(fs);
		
			Student student =(Student)os.readObject();
			Student student1 =(Student)os.readObject();
			
			System.out.println(student);
			System.out.println(student1);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
