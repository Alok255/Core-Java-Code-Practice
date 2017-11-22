import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class Book {
	int id;
	String name;

	public  Book(int id, String name) {
		this.id = id;
		this.name = name;
	}

	
}

public class App {
	public static void main(String[] args) {
		
		Book b1=new Book(1,"Java wala Book!");
		Book b2=new Book(2, "C++ wala Book!");
		Book b3=new Book(3,"C wala Book!");
		
		Map<Integer, Book> map1=new HashMap<Integer, Book>();
		map1.put(4,b1);
		map1.put(6,b2);
		map1.put(7,b3);
		for(Map.Entry<Integer, Book> entry:map1.entrySet()){
			Book n=entry.getValue();
			System.out.println(n.id + n.name);
		}
		
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		
		
		for (String m : map.keySet()) {
			System.out.println(m + " " + map.get(m));
		}

		/*Set<String> set = new LinkedHashSet<String>();
		set.add("One");
		set.add("Two");
		set.add(b1);
		set.add("Three");
		System.out.println(set);
		*/
	}                                                                                                                                                        
}
