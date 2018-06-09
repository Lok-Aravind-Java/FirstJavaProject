package collectiions;
import java.util.*;
public class Maps {

	public static void main(String[] args) {
		
		Map<Integer,String>  hashmap = new HashMap<>();
		Map<Integer,String>  linkedhashmap = new LinkedHashMap<>();
		Map<Integer,String>  treemap = new TreeMap<>();
           
		System.out.println("HashMap");
		list(hashmap);
		System.out.println("LinkedHashMap");
		list(linkedhashmap);
		System.out.println("TreeMap");
		list(treemap);
		
		
		
	}
	
	public static void list(Map<Integer,String> map){
		
		map.put(9, "Nine");
		map.put(0, "Zero");
		map.put(15, "Fifteen");
		map.put(2, "two");
		map.put(4, "four");
		map.put(7, "Seven");
		map.put(7, "sevennn");
		
		//System.out.println(map);
		
		for(Integer x : map.keySet()){
			
			System.out.println(x+" : "+map.get(x));
			
		}
	}

}
