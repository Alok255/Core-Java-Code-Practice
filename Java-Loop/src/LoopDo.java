import java.util.*;
public class LoopDo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your value : ");
		int num =0;
		
		do{
			System.out.println("Enter your value : \n \n");
			System.out.println("The do while loop is execute \t" + num + "\t Times" );
			num = input.nextInt();
		}while(num<7);
		System.out.println("We get 7 and loop is stoped!");
	}

}
