import java.util.Iterator;
import java.util.PriorityQueue;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Alok");
		queue.add("Raj");
		queue.add("Singh");
		
		System.out.println("Head :" + queue.element());
		System.out.println("Head : " + queue.peek());
		
		Iterator<String> itr=queue.iterator();
		while(itr.hasNext()){
			System.out.println(" :: + :: ");
			System.out.println(itr.next());
		}
		System.out.println(" :: After Remove :: ");
		queue.remove();
		queue.poll();
		
		Iterator<String> itra=queue.iterator();
		while(itra.hasNext()){
			System.out.println(itra.next());
		}
		
	}

}
