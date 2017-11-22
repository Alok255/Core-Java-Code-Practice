package demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("text1.txt");
		
		
		try {
			FileReader fileReader = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			
			System.out.println("Exce. is found ="+file.toString());
		}
		
		
		try{
			int num=20/0;
		}catch(ArithmeticException e){
			System.out.println(e);
		}
		
		String name="1232";
		try{
		int num2=Integer.parseInt(name);
		System.out.println(num2);
		}catch(NumberFormatException e){
			System.out.println(e);
		}

	}

}
