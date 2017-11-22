import java.util.ArrayList;
import java.util.Iterator;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");
		
		Iterator<String> itr=list.iterator();
		
		System.out.println("====Iterat List with While loop!===");
		while(itr.hasNext()){
			
			String value=itr.next();
			
			
			System.out.println(value);
			if(value.equals("Two")){
				itr.remove();
			}
			
		}
		
		System.out.println("====Iterat List with For Each loop!===");
		for(String m:list){
			System.out.println(m);
			
			//But you can't do that with for each loop
			/*
			 * if(value.equals("Two")){
			 
				itr.remove();
			}
		*/
		}
	}

}
