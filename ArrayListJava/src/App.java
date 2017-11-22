import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {

	public static void main(String[] args) {

		int[] num={21,32,34,56,76,877,34};
		ArrayList<Integer> user = new ArrayList<Integer>();
		user.add(13);
		user.add(13);
		user.add(13);
		user.add(23);
		user.add(55);
		
		//Retrieving Array List
		System.out.println("#1. Retrieving List =====");
		for(Integer num1 : user){
			System.out.println(num1);
		}
		
		//Remove ArrayList 
				user.remove(0);
				
		//Retrieving Array List		
				System.out.println("#1. Retrieving List after remove=====");
		for(int i=0; i<user.size(); i++){
			System.out.println(user.get(i));
		}
		
		//YOu can also user List Interface
		List<String> uname=new ArrayList<String>();
		uname.add("Alok");
		uname.add("Singh");
		uname.add("Raj");
		
		//Retrieve List While Loop
		Iterator alit=uname.iterator();
		while(alit.hasNext()){
			System.out.println(alit.next());
		}

	}

}
