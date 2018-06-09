package collections;
import java.util.*;
public class HashSettt {

	public static void main(String[] args) {
		
		HashSet<String>  name = new HashSet<String>();
		name.add("Mark");
		name.add("jerry");
		name.add("tina");
		name.add("tom");
		name.add("kee");
	
		 /*  name.remove(1);
	     for(String x : name)
	     	System.out.println(x);
		      name.clear();
	*/
		
		Iterator<String> tr = name.iterator();
		
		while(tr.hasNext()){
			System.out.println(tr.next());
			
		}
		
		
	}

}
