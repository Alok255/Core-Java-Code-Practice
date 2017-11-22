import java.util.*;
public class Getuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	System.out.println("Enter the value : ");
		int num1 = input.nextInt();
		
		while(num1!=5){
			
			System.out.println("Hello the loop is " + num1);
			num1 = input.nextInt();
		}
			System.out.println(" Got 5 ");
	}

}
