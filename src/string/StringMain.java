package string;

public class StringMain {

	public static void main(String[] args) {
      // string is immutable 
	    String s1 = " aravind ";
	    s1.concat("soft");
	    System.out.println(s1);
	    
	    
	    
	  // StingBuffer is Mutable
	    
	    StringBuffer sb = new StringBuffer("aravind");
	    sb.append("soft");
	    System.out.println(sb);
	}

}
