import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the name of Student :");
		String sname = input.nextLine();
		switch (sname) {
		case "Alok":
			System.out.println("You enter the name Alok" );
			break;
		case "Sab":
			System.out.println("You enter the name Sab");
			break;
		case "Rajeev":
			System.out.println("You enter the name of Rajeev");
			break;
		default:
			System.out.println("The Enter value is not avalible ");
			break;
		}
	}

}
