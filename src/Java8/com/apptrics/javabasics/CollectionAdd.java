package com.apptrics.javabasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CollectionAdd {

	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(5,5,6,5,4);
		List<Integer> n = new ArrayList<>();
		
		l.forEach(i -> n.add(i));

		n.forEach(System.out::println);
		
		
		Stream<Integer> s = n.stream();
		
		s.forEach(t -> System.out.println(t));
		s.forEach(t -> System.out.println(t)); // You cannot loop the values two times once it is looped it is done
		
		
		
	}

}
