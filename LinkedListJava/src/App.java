import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arrList = new ArrayList<Integer>();
		LinkedList<Integer> linkList=new LinkedList<Integer>();
		
		doTiming(32, arrList);
		doTiming(55, linkList);
		
		System.out.println(linkList);
		
		
	}
	
	private static void doTiming(int num, List<Integer> list){
		
		for(int i=0; i<1E5; i++){
			list.add(i);
		}
		
		long start = System.currentTimeMillis();
		
		//Add item at end of list
		/*
		for(int i=0; i<1E5; i++){
			list.add(i);
		}
		*/
		
		for(int i=0; i<1E5; i++){
			list.add(0, i);
		}
		long end =System.currentTimeMillis();
		
		System.out.println("Time Taken : " + (end - start) + "ms for " + num);
	}

}
