package com.apptrics.javabasics;

public class Basic1 {

	public static void main(String[] args) {
		
		//Type Interface
		printString((s) -> s.length());

	}

	
	public static void printString(lambdaExpression l){
		
		System.out.println(l.stringLength("Hello World!"));
	}
	
}


interface lambdaExpression{
	
	int stringLength(String s);
		
	
}