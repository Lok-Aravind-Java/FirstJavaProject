package array;
import java.util.Random;

public class ArrayRndom {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int Velo[] = new int[7];
		
		
		for(int x=0 ; x<1000 ; x++){
			++Velo[1+rand.nextInt(6)];
		}
		System.out.println("Index\tVelocity");

		for(int dice=0; dice< Velo.length ; dice++){
			
			System.out.println(dice + "\t"+ Velo[dice]);
			
		}
	}

}
