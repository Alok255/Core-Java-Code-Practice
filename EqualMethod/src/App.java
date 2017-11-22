class Test{
	
	private int id;
	private String name;
	
	public Test(int id, String name){
		this.name=name;
		this.id=id;
	}
	
	public String toString(){
		return "Test [id "+ id + "Name :" +name+"]";
	}
}
public class App {

	public static void main(String[] args) {

		Test test=new Test(21,"alok");
		Test test2 =new Test(22, "Singh");
		
		System.out.println(test==test2);
		System.out.println("\n" + test.equals(test2));
		
		Double num1=7.2;
		Double num2=7.2;
		System.out.println(num1==num2);
		System.out.println(num1.equals(num2));
		
		float f1= 2.2f;
		float f2=2.2f;
		
		System.out.println(f1==f2);
		
		String name1="Alok";
		String name2="Alok Raj".substring(0,6);
		System.out.println(name1.equals(name2));
		System.out.println(name2);
		
		//hashCode() method
		System.out.println(name2.hashCode());
		
		System.out.println(test.hashCode());

	}

}
