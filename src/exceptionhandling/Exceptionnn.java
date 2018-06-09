package exceptionhandling;

public class Exceptionnn {

	public static void main(String[] args) {
           
		
		int a;
		int[] arr = new int[2];
		
		try{
		a= 100/0;
		System.out.println( "value of  arr[3] is " + arr[3]);
		}catch(ArithmeticException e){
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}catch(Exception e){
		System.out.println(e);	
		}
		System.out.println("----------------------------------------------");
		
	}

}
