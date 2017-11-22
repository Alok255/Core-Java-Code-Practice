package demo1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		try {
			FileWriter fw=new FileWriter("alok.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			Scanner input = new Scanner(System.in);
				String name=input.nextLine();
				
			bw.write(name);
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
