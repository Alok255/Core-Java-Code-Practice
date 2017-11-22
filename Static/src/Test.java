public class Test {

	int rollno;
	String name;
	static String college = "ITS";

	Test(int r,String n){  
		   rollno = r;  
		   name = n;  
		   }  
	
	void display (){System.out.println(rollno+" "+name+" "+college);} 
	
	public static void main(String args[]){  
		 Test s1 = new Test(111,"Karan");  
		Test s2 = new Test(222,"Aryan");  
		   
		 s1.display();  
		 s2.display();

	}

}
