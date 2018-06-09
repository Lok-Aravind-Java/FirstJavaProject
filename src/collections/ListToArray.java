package collections;
import java.util.*; 
public class ListToArray {

	public static void main(String[] args) {
        
		String[] list = {"papaya","watermelon","cherry","berry","grape","lemon"};
		LinkedList<String> fruits = new LinkedList<String>(Arrays.asList(list));
		
		fruits.add("apple");
		fruits.add("gauva");
		fruits.addFirst("pumkin");
		
		list = fruits.toArray(new String[fruits.size()]);
		
		for(String x : list){
			System.out.println(x);
		}
		
	}

}
