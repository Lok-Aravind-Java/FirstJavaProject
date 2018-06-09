package exceptionhandling;
public class ExcepFinallyy {

	public static int retInt(){
		int a= 100;
		try{
			a= a/0;
			// System.exit(1);
			return a;
	       }catch(ArithmeticException e){
	    	   System.out.println("catch called");
	    	   System.out.println(e);
	    	   return a;
	       }finally{
	    	   System.out.println("Finally called");        
	       }
	}

	public static int retInte(){
			int a= 100;

			try{
				// System.exit(1);
				return a;
		       }catch(ArithmeticException e){
		    	   System.out.println("catch called");
		    	   System.out.println(e);
		       }finally{
		            a=5000;
		    	   System.out.println("Finally called");   
		    	   return a;
		       }
		}
		
	public static void main(String[] args) {
      
		 System.out.println(retInt());
		 System.out.println("----------------------------------------");
		 System.out.println(retInte());
		}
}
