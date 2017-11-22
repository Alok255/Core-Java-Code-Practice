import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class App {

	public static void main(String[] args) {

		File file=new File("test.txt");
		Scanner input=new Scanner(System.in);
		System.out.println("Enter 6 line input :");
		try(BufferedWriter bw =new BufferedWriter(new FileWriter(file))){
			
			/*bw.write("HEllo Line First!");
			bw.newLine();
			bw.write("Hello line two!");
			*/
			int i=0;
		while(i<6){
			String str=input.nextLine();
			bw.write(str);
			bw.newLine();
			bw.flush();
			i++;
		}
			
		}catch (IOException e) {
			System.out.println("File IO Exception ");
		}
		
		//BufferReader
		try(BufferedReader br=new BufferedReader(new FileReader(file))){
			String line;
			while((line=br.readLine())!=null){
				System.out.println(line);
			}
			}catch (FileNotFoundException e) {
				System.out.println("File not found :" + file.toString());
			}catch (IOException e) {
				System.out.println("IOException :" +file.toString());
			}
		
	

	}

}
