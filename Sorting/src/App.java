import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(Integer.valueOf(123));
		list.add(Integer.valueOf(133));
		list.add(Integer.valueOf(153));
		list.add(23);

		Collections.sort(list);
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
