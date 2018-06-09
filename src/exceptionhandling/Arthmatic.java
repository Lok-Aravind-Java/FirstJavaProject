package exceptionhandling;

public class Arthmatic {

	public static void main(String[] args) {
	    dostuff();
	   }

	public static void dostuff(){
		domorestuff();	
	  System.out.println(10/1);
	}
	
	
	public static void domorestuff(){ 
		
		try{
		int i = 10/0;
		System.out.println(i);
		}catch(ArithmeticException e){
			System.out.println("sorry about that");
			
		}
	}
}
