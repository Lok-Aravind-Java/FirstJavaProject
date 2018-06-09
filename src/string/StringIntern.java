package string;

public class StringIntern {

	public static void main(String[] args) {
		
		String s = "Hi";
		s += " Hello World";
		
		String s1 ="Hi Hello";
		s1 += " World";
		
		if(s.equals(s1)){
			System.out.println("True");
		}
		
		if(s== s1){
			System.out.println("Really True");
		}
		
		String s2 = s.intern();
		String s3 = s1.intern();
		  if(s2==s3){
			  System.out.println("Yes True");
		  }
		  if(s==s2){
			  System.out.println("s True");
		  }
		  if(s==s3){
			  System.out.println("es True");
		  } 
		  if(s1==s2){
			  System.out.println("s True");
		  }
		  if(s1==s3){
			  System.out.println("es True");
		  }
		  
		  
		  int i = 100;
		  String sVal= String.valueOf(i);
		 // String sVal= String.valueOf(100);
		  System.out.println(sVal);
		  
	}

}
