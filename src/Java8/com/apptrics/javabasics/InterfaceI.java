package com.apptrics.javabasics;

public interface InterfaceI {

	public static void main(String[] args) {
		functionalInter();
	}
	default void show1(){
		
		System.out.println("I");
	}
	
public default void show(){
		
		int a = 15;
		int ab= 30;
		int b = 2;
		
		
		if(a*b == ab){
		
			System.out.println("You can define methods in interface  ");
			
		}
	}
	
	public static void functionalInter(){
		System.out.println("Here is the new interface where you can write the logic in the java 8");
	}

}


