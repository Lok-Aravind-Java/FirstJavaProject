package genereics;
import java.util.*;
public class Generic1 {

	public static void main(String[] args) {
		
		Integer[] iray = {1,2,3,4};
		Character[] cray = {'a','r','a','v'};
		
		PrintMe(iray);
		PrintMe(cray);
		
	}
	
	private static <T> void PrintMe(T[] y){
		for(T x : y){
			System.out.printf("%s ", x);
		}
		System.out.println();
	}
	
	
	
	/*private static void PrintMe(Integer[] i){
		for(Integer x : i){
			System.out.printf("%s ",x);
		}
		System.out.println();
	}
	
    private static void PrintMe(Character[] c){
    	for(Character x : c){
    		System.out.printf("%s " , x);
    	}
    	
    }*/
	

}
