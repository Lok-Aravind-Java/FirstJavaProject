package string;

public class StringConversion {

	public static void main(String[] args) {
		
		// string to StringBuffer
		
		String s = "aravind";
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
		
		// StringBuffer to String
		
		StringBuffer sb1 = new StringBuffer("arya");
		String ss = sb1.toString();
		System.out.println(ss);
		
		
		

	}

}
