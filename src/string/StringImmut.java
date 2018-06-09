package string;

public class StringImmut {

	public static void main(String[] args) {
		String s1 = "Hello";
		  s1 += " World";
	      s1.concat("abc");
	   //   s1.format("h", s1);
           System.out.println(s1);
	  
         String s2 = new String ("abc");
	  s2.concat("def");
	  s2+= "ghi" ;
	  System.out.println(s2);
	
	  StringBuffer s3 = new StringBuffer("Hi");
	  s3.append("Hello");
	 
	  
	  StringBuilder s4 = new StringBuilder("Hey");
	  s4.append("Hello");
	 // s4 = s4 + "World";
	  
	  
	  
	}

}
