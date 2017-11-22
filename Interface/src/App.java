
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Machine machine = new Machine();
		Person person = new Person();
			
			machine.start();
			person.stop();

		//Now lets call Interface :- info.java
			machine.showInfo();
			person.showInfo();
	}

}
