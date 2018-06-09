package multithreading;

public class MultiMain {

	public static void main(String[] args) {
		
		Threads th = new Threads();
          th.start();
          
          Threads th1 = new Threads();
          th1.start();
	}

}
