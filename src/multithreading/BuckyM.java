package multithreading;

public class BuckyM {

	public static void main(String[] args) {
	
		Thread t1 = new Thread(new Bucky("one"));
		Thread t2 = new Thread(new Bucky("two"));
		Thread t3 = new Thread(new Bucky("three"));
		Thread t4 = new Thread(new Bucky("four"));

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
