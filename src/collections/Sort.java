package collections;
import java.util.*;
class Sort {

	public static void main(String[] args) {
		
		
		String[] stuff= { "babies","young","energetic","responsible","experienced","old"};
		List<String> l1 = Arrays.asList(stuff);
				
		Collections.sort(l1);
		System.out.printf("%s \n",l1);
		
		Collections.sort(l1,Collections.reverseOrder());
		System.out.printf("%s \n",l1);
		
		//For integers
		Integer[] stuf = {5,7,1,6,9,8,4,2,3};
		ArrayList<Integer> l2 = new ArrayList<Integer>(Arrays.asList(stuf));
		
		Collections.sort(l2);
		System.out.printf("%s",l2);
		
		Collections.sort(l2,Collections.reverseOrder());
	    System.out.printf("%s",l2);
	    
	}
}
