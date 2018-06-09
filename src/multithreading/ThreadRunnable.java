package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

class myclass implements Runnable{
	
	 public void run(){
		 
		 for ( int i = 0 ; i<10 ; i++){
			 
			 System.out.println( Thread.currentThread().getId()  + " value " + i);    
		 }
		 
		 try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }

	
}


public class ThreadRunnable {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new myclass());
		    t1.start();
		    
		   
		
       Thread t2 = new Thread(new myclass());
             t2.start();
       	
	}

}
