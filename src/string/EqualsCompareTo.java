package string;

public class EqualsCompareTo {

	public static void main(String[] args) {

		 String s1 = "aravind";
		 String s2 = "paluvadi";
		 String s3 = "aravind";
		 
		 //Equals method
		 
		 System.out.println(s1.equals(s2));
		 System.out.println(s1.equals(s3));
		 System.out.println(s2.equals(s3));
	     
		 System.out.println("aravind".equals("paluvadi"));
		 System.out.println("ARAVIND".equalsIgnoreCase("aravind"));

		 
		 System.out.println("--------------------------------------- ");

		 // CompareTo

		 System.out.println(s1.compareTo(s2));
		 System.out.println(s1.compareTo(s3));
		 System.out.println(s2.compareTo(s3));
	     
		 System.out.println("aravind".compareTo("paluvadi"));
		 System.out.println("PALUVADI".compareToIgnoreCase("paluvadi"));
		 System.out.println();
	
	}

}
