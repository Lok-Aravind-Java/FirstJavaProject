package com.apptrics.javabasics;

public class MethodRefference {

	public static void main(String[] args) {
		
		     
           Thread t = new Thread(() -> printMessage() );
		   
           Thread t1 = new Thread(MethodRefference::printMessage);
	
	            t.start();
	            
	            t1.start();
	}

	
	public static void printMessage(){
		System.out.println("Thread has started");
	}
}
