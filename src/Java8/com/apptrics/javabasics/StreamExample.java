package com.apptrics.javabasics;

import java.util.ArrayList;

public class StreamExample {

	public static void main(String[] args) {		
		ArrayList<String> list = new ArrayList<>();

		list.add("Prathap");
		list.add("Jagan");
		list.add("Sai");
		list.add("Sudheer");
		list.add("Ram");
		
		
		
		list.parallelStream().filter(p -> p.startsWith("S")).forEach(System.out::println);
		
		
		long x =list.stream().filter(p -> p.startsWith("S")).count();
		System.out.println(x);
	}

}
