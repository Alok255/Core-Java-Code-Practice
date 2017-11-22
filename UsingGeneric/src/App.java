import java.util.*;
import java.util.ArrayList;


public class App {

		public static void main(String[] args){
			///Befor java 5 ///
			ArrayList listname =new ArrayList();
					listname.add("Alok");
					listname.add(21);
					
		///Modern Style///			
			ArrayList<String> list=new ArrayList<String>();
				list.add("Alok");
				list.add("Sab");
				list.add("Rajeev");
				//list.addAll(21);
				
				///Modern Style///
				HashMap<String, Integer> hlist=new HashMap<String, Integer>();
					hlist.put("ALok", 1);
					System.out.println(hlist.get("ALok"));
					
				System.out.println(list.get(1)+listname.get(0) + listname.get(1));
		}
}
