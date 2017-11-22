import java.util.Scanner;


public class Userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create Scanner Object 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Your name : ");
		
		//Wait for user input 
		String line = input.nextLine();
		
		//Get user input Integer
		int num = input.nextInt();
		
		//Get user double value
		double num1 = input.nextDouble();
		
		System.out.println("YOur Name is : " +line + "\n You Enter Number : " + num+ "\t Double Value" + num1);
		
		
	}

}
