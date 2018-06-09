package lamdaexpression;

public class Lamthr {

	public static void main(String[] args) {
		
		Thread my = new Thread(() ->System.out.println("Hello world!"));
		
		my.run();
		my.start();
		

	}

}
