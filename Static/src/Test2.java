import java.util.concurrent.CountDownLatch;

class Student1{
		public static int LUCKY_NUMBER = 003;
	public String name;
	public int age;
	public static String collgeg = "SAM College";
	
	
	//YOu can also count method using Static Keyword
	public static int count=0;
	
	public void Student(){
		count ++;
	}
	public void getValue(String name, int age){
		System.out.println(name + " " + age + " " + collgeg);
	}
	
	//Create Static Method 
	public static void getStudent(){
		System.out.println("Static Method is Running with Static Varival : " + collgeg);
	}
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 student = new Student1();
				student.getValue("Alok Raj Singh", 21);
				student.getStudent();
		System.out.println(Math.PI);	
		System.out.println(Student1.LUCKY_NUMBER);
		System.out.println("Count Method Using Static " + student.count);
	}

}
