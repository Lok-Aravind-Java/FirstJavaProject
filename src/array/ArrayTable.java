package array;

public class ArrayTable {

	public static void main(String[] args) {
		
		System.out.println("Index\tTable");
		
		int array[] = {12,22,32,42,52,62,72,82,92};
		
		for(int counter=0 ; counter<array.length ; counter++ ){
			
			System.out.println(counter + "\t " + array[counter]);
		}
		
	}

}
