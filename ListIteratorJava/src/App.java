import java.util.ArrayList;
import java.util.ListIterator;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> uname = new ArrayList<String>();
		uname.add("ALOK");
		uname.add("SIngh");
		uname.add("Raj");
		uname.add("Rajeev");

		ListIterator<String> itrname = uname.listIterator();
		System.out.println("Traversing Element in forward Direction...!");
		while (itrname.hasNext()) {
			System.out.println(itrname.next());

		}
		
		System.out.println("Traversing element in backward Direction...!");
		
		while(itrname.hasPrevious()){
			System.out.println(itrname.previous());
		}

	}

}
