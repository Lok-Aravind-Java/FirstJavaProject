package first;

public class VariableLengthArguements {

	public static void main(String[] args) {
		
		
		System.out.println(average(45,56,45,89,56,78));	

	}

	public static int average(int...numbers){
		
		int sum=0;
		
		for(int i : numbers){
			sum+=i;
			
		}
		return sum/numbers.length;
	}
}
