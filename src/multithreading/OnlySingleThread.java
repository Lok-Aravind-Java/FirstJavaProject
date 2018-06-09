package multithreading;

public class OnlySingleThread {

	public static void main(String[] args) {
		
		Thread t = new Thread(new Runnable(){
			    public void run (){
			    	for (int i = 0 ; i<10 ; i++){
			    		System.out.println(Thread.currentThread().getId() + " Value " + i);
			    		
			    	}
			    	try {
						Thread.sleep(10000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
			    	
			    }
		});

		t.start();
	}

}
