package collections;

import java.util.*;

public class Collecaddall {

	public static void main(String[] args) {
		
		String[] stuff = {"corn","milk","eggs","curd"};
        List<String> list = Arrays.asList(stuff);
        
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("youtube");
        list1.add("google");
        list1.add("movierulz");
        
        for(String x : list1){
        	System.out.printf("%s ",x);
        }
        
        Collections.addAll(list1, stuff);
     
        System.out.println();
        for(String y : list1){
        	System.out.printf("%s ", y );
        
        }
        System.out.println();
        System.out.println(Collections.frequency(list1, "corn"));	
        
        
        boolean tof = Collections.disjoint(list,list1);
        System.out.println(tof);
        
        if(tof){
        	System.out.println("list1 and list are completely different");
        }else{
        	System.out.println("list1 and list do have something in common");
        }
        
	}

}
