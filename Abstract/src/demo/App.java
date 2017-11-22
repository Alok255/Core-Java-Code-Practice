
package demo;

abstract class Test{
	
	private String name="Alok";
	abstract void show();
}

class Test1 extends Test{
	void show(){
		System.out.println("Hello Alok");
	}
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test1();
			test.show();

	}

}
