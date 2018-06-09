package string;

public class StringM2 {

	public static void main(String[] args) {
		
		String x = "aravindpaluvadiaravindpaluvadi";
		
		System.out.println(x.indexOf("a"));
		System.out.println(x.indexOf("a",4));
		System.out.println(x.indexOf("ara"));
		System.out.println(x.indexOf("ara",4));
		
	   String a = "Hi";
	   String b = " Hello ";
	   
	   System.out.println(a+b);
	   System.out.println(a.concat(b));
	   System.out.println(b.toUpperCase());
	   System.out.println(b.trim());
	   System.out.println(a.replace("H", "Pa"));
  	}

}
