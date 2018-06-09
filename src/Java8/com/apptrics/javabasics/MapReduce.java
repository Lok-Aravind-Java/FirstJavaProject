package com.apptrics.javabasics;

import java.util.Arrays;
import java.util.List;

public class MapReduce {

	public static void main(String[] args) {
		
		
		List<Integer> values = Arrays.asList(1,2,3,4,5);
		

		
      //System.out.println(values.stream().map(i -> i*2).reduce(0,(c,e) -> c+e));		

		//System.out.println(values.stream().map(i->i*2).reduce(0,(c,e) -> Integer.sum(c, e) ));
		
		System.out.println(values.stream().map(i->i*2).reduce(0,Integer::sum));
		
		System.out.println();
		streamArray();
		
		System.out.println();
		streamFilter();
		
	}
	
	public static void streamArray(){
		
		List<Integer> val = Arrays.asList(12,20,35,46,55,68,75);
		
	/*	int result = 0;
		for(int v : val){
		if(v%5==0){
			result += v;
		}
		}
		
		System.out.println(result);*/
		
		System.out.println(val.stream().filter(i -> i%5 == 0).map(i -> i*2).reduce(0,(c,e)->Integer.sum(c, e)));
		System.out.println(val.stream().filter(i -> i%5 == 0).reduce(0,(c,e)->Integer.sum(c, e)));
		
	}

	public static void streamFilter(){
		
		List<Integer> ls = Arrays.asList(5,85,63,21,51,81,25,141,567,75,17);
		
	System.out.println(ls.stream().filter(i -> i%2 == 0).map(i -> i*3).findFirst());
	System.out.println(ls.stream().filter(i -> i%2 == 0).map(i -> i*3).findFirst().orElse(0));
		
	}
}
