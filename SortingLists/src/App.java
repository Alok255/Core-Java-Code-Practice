import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {

	int lan1=s1.length();
	int lan2=s2.length();
	if(lan1>lan2){
		return 1;
	}else if(lan1<lan2){
		return -1;
	}
		return 0;
	}
	
}

class AlphabeticalComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {

	return s1.compareTo(s2);
	}
	
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("Alok");
		list.add("Raj");
		list.add("Singh");
		list.add("Taha");
		list.add("Rajeev");
		list.add("Sam");
		list.add("Muskan!");

		//Collections.sort(list, new StringComparator());
		Collections.sort(list, new AlphabeticalComparator());

		for (String name : list) {
			System.out.println(name);
		}

		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(4);
		num.add(1);
		num.add(6);
		num.add(65);
		num.add(423);
		num.add(2);
		
		Collections.sort(num, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		for(Integer num1:num){
			System.out.println(num1);
		}

	}

}
