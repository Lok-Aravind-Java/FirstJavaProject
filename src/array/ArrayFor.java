package array;

public class ArrayFor {

	public static void main(String[] args) {
	
		int bucky[] = {3,4,5,6,7};
		
	int total=0;
	
	for(int x : bucky){
		total+=x;
	}
	System.out.println("The Total is "+total);
	
	System.out.println("---------------------------------------------------");
	
	for (int i : bucky){
		System.out.println("The array element is "+ i);
		
	}
	
	
	
	}

}
