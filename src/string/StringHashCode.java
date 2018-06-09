package string;

public class StringHashCode {

	public static void main(String[] args) {
		 String a = "hi";
		 System.out.println(a.hashCode());
	     a.concat("hello");
	     System.out.println(a.hashCode());
	     System.out.println(a);
	     
	     StringBuffer x = new StringBuffer("Hi");
	     System.out.println(x.hashCode());
	     x.append("Tom");
	     System.out.println(x.hashCode());  
	     x.insert(2, "Jack");
	     System.out.println(x);
	}

}
