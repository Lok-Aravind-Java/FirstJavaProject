package collections;
import java.util.*;
public class HashSetttttt {

	public static void main(String[] args) {
		
		String[] arr = {"milk","apples","honey","butter","milk","honey"};
        List<String> ls = Arrays.asList(arr);
        
        System.out.printf("%s", ls);
        System.out.println();
        
        Set<String> hs = new HashSet<String>(ls);
       // hs.addAll(ls);
        System.out.printf("%s",hs);
        
        
	}

}
