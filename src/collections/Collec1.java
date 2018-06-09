package collections;
import  java.util.*;
public class Collec1 {
		
	public static void main(String[] args){

	String[] thing = {"apples","noobs","pwnge","bacon","goats"};
	List<String> list1 = new LinkedList<String>();
	
	for(String x : thing){
		list1.add(x);	
	}
	
	String[] things = {"sausage","bacon","goats","harrypotter"};
	List<String> list2 = new LinkedList<String>();
	
	for(String x: things){
		list2.add(x);
	}
	
	list1.addAll(list2);
	list2 = null;
		
	
	printme(list1);
	 System.out.println();
	removeStuff(list1,2,5);
	printme(list1);
	 System.out.println();
	reverseStuff(list1);
	
	}
     private static void printme(List<String> l){
    	 for(String x : l){
    		 System.out.print(x + "\t");
    		
    	 }
     }
     
     private static void removeStuff(List<String> l,int from, int to){
    	 
    	l.subList(from, to).clear();
     }
     private static void reverseStuff(List<String> l){
            	 ListIterator<String> y = l.listIterator(l.size());
            	 
            	 while(y.hasPrevious()){
            		 System.out.printf("%s\t",y.previous());
            	 }
     }
     }