package collectiions;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Queues {

	public static void main(String[] args) {
		
		Queue<Integer> q = new ArrayBlockingQueue<>(3);
		q.add(12);
		q.add(13);
		q.add(7);
		
		System.out.println("Top element "+q.element());
		System.out.println("Removed Element "+q.remove());
		System.out.println(" Elements in the Queue "+q);

	}

}
