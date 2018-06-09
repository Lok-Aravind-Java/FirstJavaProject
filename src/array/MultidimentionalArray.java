package array;

public class MultidimentionalArray {

	public static void main(String[] args) {
        
		int firstarray[][]= {{1,2,3},{4,5,6},{7,56,89,45,56,2}};
		int secondarray[][]= {{5,6,4,8,9,7,8,},{4,5,8,5},{2},{4,5,6,3,5,},{1,2,3},{0,2,5,3},{5,6},{4,5,6,4,5,6,4,5,6,8}};
		
		System.out.println("This is the first array");
		display(firstarray);
		
		System.out.println("This is the second array");
		display(secondarray);
	}
	
	
	public static void display(int i[][]){
		
		for(int row=0;row<i.length;row++){
			for(int column=0;column<i[row].length;column++){
				System.out.print(i[row][column]+"\t");
				
			}
			System.out.println();
		}
		
	}
}
