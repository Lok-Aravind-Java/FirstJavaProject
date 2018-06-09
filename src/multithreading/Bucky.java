package multithreading;
import java.util.*;
public class Bucky implements Runnable {

	Random r = new Random();
	
	String name;
	int time;
	
	public Bucky(String x){
		name=x;
		time=r.nextInt(999);
		
	}
	
	public void run() {
		
		try {
			
			System.out.printf("the thread %s started at %d \n", name , time);
			Thread.sleep(time);
			System.out.println();
			System.out.printf("the thread %s is done",name);
		
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
	
	

}
