package first;

import java.util.Scanner;

public class MathOperaor5 {

	public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
      
    double number1, number2, total;
    
    
    System.out.println("Enter the First Number");
    number1 = input.nextDouble();
    
    System.out.println("Enter the Second Number");
    number2 = input.nextDouble();
    
   //For Addition
    
    total = number1 + number2;
    System.out.println("The addition of two numbers is " + total);
    
    //For Subtraction
    
    total = number1 - number2;
    System.out.println("The Substraction of two numbers is " + total);
 
    //For Multiplication
    
    total = number1 * number2;
    System.out.println("The Multiplication of two numbers is " + total);
  
    //For Division
    
    total = number1 / number2;
    System.out.println("The Division of two numbers is " + total);
    
	}

}
