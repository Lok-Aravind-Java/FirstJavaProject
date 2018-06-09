package collectiions;

import java.util.HashSet;
import java.util.Set;

public class Setss {

	public static void main(String[] args) {
	Set<String> set = new HashSet<String>();
	    
	set.add("dog");
	set.add("cat");
	set.add("snake");
	set.add("beer");
	set.add("deer");

	Set<String> set1 = new HashSet<String>();
       set1.add("dog");
       set1.add("cat");
       set1.add("girafee");
       set1.add("monkey");
       set1.add("ant");
       
       
       set1.retainAll(set);
       System.out.println(set1);
       
      /* set1.removeAll(set);
       System.out.println(set1);*/
       
	}

}
