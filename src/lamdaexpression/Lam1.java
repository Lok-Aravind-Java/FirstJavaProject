package lamdaexpression;

public class Lam1 {

	public static void main(String[] args) {
		
		Lmddddd	doublex = () -> {
		    	System.out.println("Hello World");
		};
		
		doublex.foo();	
		
		Lmddddd innerclass = new Lmddddd (){
			public void foo(){
				System.out.println("Hello World");
			}
		};
		innerclass.foo();
	}
}