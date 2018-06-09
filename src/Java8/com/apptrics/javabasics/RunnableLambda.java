package com.apptrics.javabasics;

public class RunnableLambda {

	public static void main(String[] args) {
		
		
		
		Thread t = new Thread(new Runnable(){

			@Override
			public void run() {
				
				System.out.println("This is a normal thread");
			}
		});
		
		t.start();
		
		
		Thread l = new Thread(()-> System.out.println("This is a Lambda Thread"));
		
		l.start();
	}

}

