import java.util.HashSet;
import java.util.Iterator;


public class App {

	public static void main(String[] args) {
		
		HashSet<String> name=new HashSet<String>();
		name.add("Alok");
		name.add("Raj");
		name.add("Singh");
		name.add("Singh");
		name.add(null);
		
		Iterator<String> itr= name.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
				}
}
