import java.util.HashMap;
import java.util.Map;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> name=new HashMap<Integer, String>();
		name.put(1, "JAVA");
		name.put(2, "Android");
		name.put(2, "Android App");
		name.put(3, "PHP");
		name.put(4, "C & C++");
		
		//Remove the element
		name.remove(3);
		
		System.out.println(name.get(6));
		
		for(Map.Entry m : name.entrySet()){
			int key=(int) m.getKey();
			String nameU=(String) m.getValue();
			System.out.println(key + " " + nameU );
		}
	}

}
