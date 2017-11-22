import java.util.*;
class Frog{
	private String name;
	private int age;
	
	//First two method setName and setAge with this keyword 
	public void setName(String name) {
		this.name=name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	//Then create two other method getName and setAge with return
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}
public class Setter {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Name & Age :\n");
		String uName = scan.nextLine();
		int uAge = scan.nextInt();
		// Create object using Upper Class name Frog
		
		Frog frog = new Frog();
			frog.setName(uName);
			frog.setAge(uAge);
		String newName = frog.getName();
		int newAge = frog.getAge();
		System.out.println("MY NAME IS " + newName + "\nAND MY AGE :" +newAge);
	}

}
