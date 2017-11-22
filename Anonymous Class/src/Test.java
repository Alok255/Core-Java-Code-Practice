//First Class
class Test1{
	public void stop(){
		System.out.println("Hello Anonymous Class!");
	}
}

//Second Class 
class Test2{
	
	//This is Overriding of stop() method
	public void stop() {
		System.out.println("Hello Alok ");
	}
}
public class Test {

	public static void main(String[] args) {
		
		Test1 test1 = new Test1();
			test1.stop();
		Test2 test2 = new Test2();
				test2.stop();
				
	//Now Override stop() Method by using Anonymous Class
		Test1 test3 =new Test1(){
			@Override
			public void stop() {
				System.out.println("Helllo stop method class with Anonymous Class!");
			}
		};
		test3.stop();
			

	}

}
