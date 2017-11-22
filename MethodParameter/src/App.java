import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> name = new HashMap<Integer, String>();
		name.put(1, "Alok");
		name.put(2, "Singh");
		name.put(3, "Raj");
		name.put(5, "Alok");

		System.out.println(name.get(1));

		for (Map.Entry m : name.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}
}
