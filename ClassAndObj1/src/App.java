class Persson1 {
	String name;
	int age;
	void msg(){
		System.out.println("Hello men" + (String) name + "My Age :" + age);
		
	}
	
	int calc(){
		int ageresult = 60 - age;
		return ageresult;
	}
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persson1 person = new Persson1();
		person.name = "Alok Raj Singh";
		person.age = 21;
		person.msg();
		int agecal = person.calc();
		System.out.println("Your arg :" + agecal);

		System.out.println(person.name + person.age);

	}

}
