import java.util.AbstractQueue;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.AbstractQueuedLongSynchronizer;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);
		q1.add(2);
		q1.add(5);
		q1.add(4);
		
		try {

			q1.add(1);
			q1.add(5);
			q1.add(9);
		} catch (IllegalStateException e) {
			System.out.println(e);
		}
		for(Integer m:q1){
			System.out.println(m);
		}
		
		System.out.println("Remove from :" +q1.remove());
		System.out.println("Remove from :" +q1.remove());
		System.out.println("Remove from :" +q1.remove());
		try {
			System.out.println("Remove from :" +q1.remove());
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		
		Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);
		q2.offer(2);
		q2.offer(5);
		if(q2.offer(4)==false){
			System.out.println("Offer(4) failed to add!");
		}
		
		for(Integer itrq2:q2){
			System.out.println("Queue 2 Value :" + itrq2);
		}
		
		System.out.println("Queue 2 Poll :" + q2.poll());
		System.out.println("Queue 2 Poll :" + q2.poll());
		System.out.println("Queue 2 Poll :" + q2.poll());
	}

}
 