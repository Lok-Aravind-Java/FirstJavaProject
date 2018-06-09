package genereics;

public class GenericM {

	public static void main(String[] args) {
		
     System.out.println("The max element is :");
     System.out.println(max(22,42,11));
     System.out.println(max(6.6,7.7,8.8));
     System.out.println(max("apple","tots","zchicken"));
     
	}

	private static <T extends Comparable<T>> T max(T a,T b,T c){
		 T m=a;
		 
		 if(b.compareTo(a)>0){
			 m=b;
			 
		 }
		 if(c.compareTo(b)>0){
			 m=c;
		 }
		 
		 return m;
	}
}
