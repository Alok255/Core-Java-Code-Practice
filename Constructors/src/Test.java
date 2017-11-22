class Student{
		String name;
	//Create Constructors and its name as Class Name
	 public Student() { //This is first Constructor
		 System.out.println("This is first Constructor Running Const!");
	}
	 
	public Student(String name) {//This is second constructor
			this.name = name;
		System.out.println("This is second Constructor Running Const! \t" + name);
	} 
}

public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		Student student2 = new Student("Alok Raj Singh");		
			new Student();//You can also call Constructor like this
			

	}

}
