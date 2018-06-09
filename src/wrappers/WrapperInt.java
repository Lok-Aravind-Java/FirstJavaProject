package wrappers;

public class WrapperInt {
	
	public static void main(String[] args) {
	
	 WrapperInt k = new WrapperInt();
	 
	     String s1 = "156";
		int i = Integer.parseInt(s1);
		 System.out.println(i);
		        
	      
		  int abc = 3200;   
		 Integer in = new Integer(abc);
		   k.amber(in);
       
	} 
	
	
	public void amber(Object o){
		 System.out.println(o);
	 }

}
