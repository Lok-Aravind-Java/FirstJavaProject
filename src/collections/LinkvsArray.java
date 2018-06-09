package collections;
import java.util.ArrayList;
import java.util.LinkedList;
public class LinkvsArray {

	public static void main(String[] args) {
       long n = (long) 1E7;
       //insert operation
       ArrayList arraylist = new ArrayList();
       long millis = System.currentTimeMillis();
          for(int i = 0 ; i<n ; i++){
        	  arraylist.add(i);
          }
		System.out.println("insert arrylist takes : " + (System.currentTimeMillis()- millis) + "ms");
		
		LinkedList linklist = new LinkedList();
		long mills = System.currentTimeMillis();
		for(int i = 0 ; i<n ; i ++){
			linklist.add(i);
		}
		System.out.println("insert linklist takes : " + (System.currentTimeMillis()- mills) + "ms");
		
		// delete operation
	     millis = System.currentTimeMillis();
	     arraylist.remove(1E3);
	     System.out.println("del arrylist takes : " + (System.currentTimeMillis()- millis) + "ms");

	     mills = System.currentTimeMillis();
	     linklist.remove(1E3);
	     System.out.println("del linklist takes : " + (System.currentTimeMillis()- mills) + "ms");
	     
	     //to get front , mid ,end
	     millis = System.currentTimeMillis();
	     arraylist.get((int)n/2);
	     System.out.println("front arrylist takes : " + (System.currentTimeMillis()- millis) + "ms");

	     mills = System.currentTimeMillis();
	     linklist.get((int)n/2);
	     System.out.println("front linklist takes : " + (System.currentTimeMillis()- mills) + "ms");
	     
	}
	
}
