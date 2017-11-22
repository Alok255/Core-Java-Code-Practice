package demo5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class App {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Test test=new Test();
		
			try {
				test.run();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch(ParseException e){
				e.printStackTrace();
			}
			
			
		
		try{
			test.input();
		}catch(FileNotFoundException e){
			
		}catch(IOException e){
			
		}

	}

}
