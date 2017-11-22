import java.util.*;

class College extends Section {

	public void Sname() {
		System.out.println("Hello This is College Class");

	}
}

class Section {
	public void Section() {
		System.out.println("Hello this is Section class \n Enter value :");
		Scanner input = new Scanner(System.in);
		int num1, num2, sum;
		num1 = input.nextInt();
		num2 = input.nextInt();
		String name = input.nextLine();
		sum = num1 + num2;
		System.out.println("Result :" + sum+name);
	}
}
