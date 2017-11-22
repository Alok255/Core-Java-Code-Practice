package demo1;

abstract class Bike{
	public Bike() {
		System.out.println("Hello Create Class!");
	}
	
	public void start(){
		System.out.println("Bike Start!");
	}
	
	abstract void stop();
}

class Machine extends Bike{

	@Override
	void stop() {
		System.out.println("Hello Stop!");
		
	}
	
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bike bike=new Machine();
		bike.start();
		bike.stop();
	}

}
