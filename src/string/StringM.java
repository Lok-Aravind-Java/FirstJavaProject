package string;

public class StringM {

	public static void main(String[] args) {
		
		String arr[] = {"funk","chunk","furry","bacanator"};
		
		for(String x : arr){
			if(x.startsWith("fu"))
			System.out.println(x);		
		}
		for(String x : arr){
			if(x.endsWith("nk"))
				System.out.println(x);		
		 
		}
		
	}

}
