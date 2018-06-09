package string;

public class Stringabc {

	Stringabc(String str){
		
	}
	public static void main(String[] args) {
		
		 String a = "Shusheel";
		 String b = "Shusheel";
		 System.out.println(a==b);
		 System.out.println(a.equals(b));
		
		 System.out.println("-----------------------------------");
		 
		 Stringabc a1 = new Stringabc("anu");
		 Stringabc a2 = new Stringabc("anu");
		 System.out.println(a1==a2);
		 System.out.println(a1.equals(a2));
		 
		 
		 System.out.println("-----------------");
		 
		 String s1 = new String("Shusheel");
		 String s2 = new String("Shusheel");
		 System.out.println(s1==s2);
		 System.out.println(s1.equals(s2));
		
		 
		 System.out.println("-------------------------------------");
		 
		 StringBuffer sb1 = new StringBuffer("Shusheel");
		 StringBuffer sb2 = new StringBuffer("Shusheel");
		 System.out.println(sb1==sb2);
		 System.out.println(sb1.equals(sb2));
		 
		 
	}

}
