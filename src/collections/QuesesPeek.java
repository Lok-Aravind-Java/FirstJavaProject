package collections;
import java.util.*;
public class QuesesPeek {

	public static void main(String[] args) {
		
		PriorityQueue<String>  q = new PriorityQueue<String>();
		q.offer("First");
		q.offer("Second");
		q.offer("Third");
		
		System.out.println("the elements in the queue :");
		System.out.printf("%s ", q);
		System.out.println();
		
		//shows you the first element in the queue
		System.out.println("the first element in the queue is :");
		System.out.printf("%s ", q.peek());
		System.out.println();
		
		//removes the first element in the queue
		System.out.println("the queue after the first element is removed");
		q.poll();
		System.out.printf("%s ", q);
	}

}
