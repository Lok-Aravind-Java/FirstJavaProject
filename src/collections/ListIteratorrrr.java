package collections;
import java.util.*;
public class ListIteratorrrr {

	public static void main(String[] args) {
    
	ArrayList<String> names = new ArrayList<String>();
	
	names.add("marry");
	names.add("jane");
	names.add("gal");
	names.add("kate");
	names.add("set");
	
	ListIterator<String> itr = names.listIterator();
//	Iterator<String> it = names.iterator();
	
	

	while(itr.hasNext()){
		System.out.println(itr.next());
	}
		
	System.out.println("------------------------------------");
	
	
	while(itr.hasPrevious()){
		System.out.println(itr.previous());
	}
	
	}
	public void doSomething(List<String> abc){
		
	}

}
