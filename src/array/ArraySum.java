package array;

public class ArraySum {

	public static void main(String[] args) {
		
		int array[]= {23,54,63,9,78,45,89,65,25,45};
		
		 int sum = 0;
		 
		 for (int x=0 ; x<array.length;x++){
			 sum += array[x];
			 
		 }
System.out.println("the sum of the array is " + sum);
	}

}
