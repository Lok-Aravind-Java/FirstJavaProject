package com.apptrics.javabasics;

public class LazyEvaluation {

	public static void main(String[] args) {
	
	
      	MyLambda MyLambdaExpression = () -> System.out.println("Hello World");

      	Myaddd  MyLambdaAdd = ( a,  b) -> a+b; 
      	
      	
      	MyLambdaExpression.foo();
	}

}


interface MyLambda{
	
	void foo();
}

interface Myaddd {
	int add(int x, int y);
}