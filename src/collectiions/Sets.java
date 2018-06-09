package collectiions;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		
		Set<String> hashset = new HashSet<String>();
		Set<String> linkedhashset = new LinkedHashSet<String>();
		Set<String> treeset = new TreeSet<String>();
		
		System.out.println("HashSet\n");
		list(hashset);
		System.out.println("\nLinkedHasSet\n");
		list(linkedhashset);
		System.out.println("\nTreeSet\n");
		list(treeset);
		
		

		Set<String> intersection = new HashSet<String>(hashset);
		System.out.println(intersection);
		
	}
public static void list(Set<String> map){
		
		map.add("Nine");
		map.add( "Zero");
		map.add( "Fifteen");
		map.add( "two");
		map.add("four");
		map.add( "Seven");
		map.add( "sevennn");
		
		//System.out.println(map);
		
		for(String x : map){
			
			System.out.println(x);
			
		}
	}


}
