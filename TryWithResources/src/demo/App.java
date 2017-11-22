package demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

	public static void main(String[] args) {
		
		File file=new File("test.txt");
		
		try(BufferedReader br=new BufferedReader(new FileReader(file) )){
			
			String name;
			while((name=br.readLine())!=null){
				System.out.println(name);
			}
		}catch (FileNotFoundException e) {
			System.out.println("File not found " + file.toString());
		}catch (Exception e) {
			System.out.println("IO Exception :" + file.toString());
		}
		
		

	}

}
