package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollecMain {

	public static void main(String[] args) {
		
		String things[] = {"Eat","Lasers","hats","rats"};
		List<String> list1 = new ArrayList<String>();
		
		for(String x : things){
			list1.add(x);
		}

		String words[] = {"Eat","rats"};
		List<String> list2 = new ArrayList<String>();
		
		
		for(String f : words){
			list2.add(f);
		}
		
		
		for(int i=0; i < list1.size();i++){
			System.out.printf("%s \t",list1.get(i));
		}
		System.out.println();
		
		for(int i=0; i < list2.size();i++){
			System.out.printf("%s \t",list2.get(i));
		}
		
		endlist(list1,list2);
		
		for(String i : list1){
			System.out.println(i);
		}
				
				
	}

	public static void endlist(Collection<String> l1,Collection<String> l2){
		
		Iterator<String> it = l1.iterator();
		
		while(it.hasNext()){
			if(l2.contains(it.next())){
				it.remove();
			}
		}
 	}
}
