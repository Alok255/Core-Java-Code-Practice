import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
	public static void main(String[] args) {

		// Set<String> name = new HashSet<String>();

		Set<String> name = new TreeSet<String>();
		
		
		name.add("Alok");
		name.add("Alok2");
		name.add("Alok3");
		name.add("Alok4");
		name.add("Alok5");
		name.add("Dog");
		System.out.println(name);
		
		if(name.contains("Dog")){
			System.out.println("Sets Contains Dog!");
		}
		if(name.isEmpty()){
			System.out.println("Sets is Emptty!");
		}
	}
}
