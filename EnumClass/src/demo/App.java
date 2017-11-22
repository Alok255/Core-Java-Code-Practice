package demo;

public class App {

	public enum Days{Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Days d: Days.values()){
			System.out.println(d);
		}

	}

}
