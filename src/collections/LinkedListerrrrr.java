package collections;
import java.util.LinkedList;
public class LinkedListerrrrr {

	public static void main(String[] args) {
     LinkedList<String> mylink	= new LinkedList<String>();
          
     mylink.add("pratik");
     mylink.add("patrik");
     mylink.add("jack");
     mylink.add("james");
     mylink.add("jhon");
     
     for (String x : mylink){
    	 System.out.println(x);
     }
       System.out.println("size :" + mylink.size()); 
	
   	System.out.println("------------------------------");

   	//adding first and last elements
	mylink.addFirst("zack");
	mylink.addLast("zerry");
	
	for (String x : mylink){
   	 System.out.println(x);
    }
	 System.out.println( "size : " + mylink.size()); 
	 
	  System.out.println("------------------------------");
	 
	  //remove first and last
	 mylink.removeFirst();
	 mylink.removeLast();
	 for (String x : mylink){
	   	 System.out.println(x);
	    }
		 System.out.println(mylink.size()); 
		 
		 System.out.println("------------------------------");
	 //add element at any index
		 mylink.add(1, "index1");
		 for (String x : mylink){
		   	 System.out.println(x);
		    }
			 System.out.println("size : " + mylink.size()); 
		
			 System.out.println("-------------------");
			 
		 // remove any element
			 mylink.remove(1);
			 for(String x: mylink){
				 System.out.println(x);
			 }
		 System.out.println("size : " + mylink.size());
		 
		 System.out.println("-----------------------------------");
		 // to set a value at particular index
		 mylink.set(1, "PAAAAT");
		 for(String x: mylink){
			 System.out.println(x);
		 }
	 System.out.println("size : " + mylink.size());
		
	 System.out.println("------------------------------");
   // clear
	 mylink.clear();
	 System.out.println("size : " + mylink.size()); 
	
	
	}
}
