package string;

import java.io.*;
import java.util.*;

public class StringTknizer {

	public static void main(String[] args) {

		String s1 = "aravind; 12345, true ";
		
	 StringTokenizer stk = new StringTokenizer(s1,";, ");
	      
	       
	      String string1 = stk.nextToken();
	       int number = Integer.parseInt(stk.nextToken());
	       boolean validity = Boolean.parseBoolean(stk.nextToken());
	       
	       if(validity){
	       System.out.println(string1);
	       System.out.println(number);
            	}
	       else{
	    	   System.out.println("invalid string..");
	       }

	       //------------------
	       
	       while(stk.hasMoreTokens()){
		    	  System.out.println(stk.nextToken());
		    	  }
			
		       
	}
}
