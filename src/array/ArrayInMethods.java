package array;

public class ArrayInMethods {

	public static void main(String[] args) {
		
		int arya[] = {3,5,3,5,3,5};

		change(arya);
	for(int i : arya ){
	System.out.println(i);
	}
	}

	
	public static void change(int x[]){
		 for(int counter= 0 ; counter<x.length; counter++){
			 x[counter]+=5;
		 }
		
	}
}
