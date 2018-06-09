package collections;
import java.util.ArrayList;

public class Arraylisterrrr {

	public static void main(String[] args) {

		ArrayList<Integer> mylist = new ArrayList<Integer>(5);
		  mylist.add(1);
		  mylist.add(5);
		  mylist.add(3);
		  mylist.add(55);
		  mylist.add(17); 
		 
		  for(Integer x : mylist){
			  System.out.println(x);
		  }
		  
		  //size
		System.out.println( " size is : " +  mylist.size());
		
		System.out.println("------------------------------");
		
		//change the value
		mylist.set(1, 100);
		 for(Integer x : mylist){
			  System.out.println(x);
		  }
			System.out.println("------------------------------");

		// remove an element
		mylist.remove(1);
		  for(Integer x : mylist){
			  System.out.println(x);
		  }
		System.out.println( " size is : " +  mylist.size());  

		System.out.println("------------------------------");

		//trim to size
		 mylist.add(1);
		  mylist.add(5);
		  mylist.add(3);
		  mylist.trimToSize();
		  for(Integer x : mylist){
			  System.out.println(x);
		  }
		System.out.println( " size is : " +  mylist.size());  

		System.out.println("------------------------------");

		//clear
		mylist.clear();
		System.out.println( " size is : " +  mylist.size());  
		    
	}

}
