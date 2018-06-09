package first;

public class IncreDecre6 {

	public static void main(String[] args) {
		
		double apple;
		apple = 7;
		
		/*Increment Operator*/
		
		/*Pre- Increment*/
		System.out.println(++apple);
		System.out.println(apple);
 
        /*Post-Increment*/
		System.out.println(apple++);
		System.out.println(apple);
		
		/*Decrement Operator*/
		
		/*Pre-Decrement*/
		System.out.println(--apple);
		System.out.println(apple);

		/*	Post-Decrement*/
		System.out.println(apple--);
		System.out.println(apple);
		
		/*  Math operators*/
		
		apple +=9;
		System.out.println("The apple addition value is" + apple);
		
		apple -=9;
		System.out.println("The apple subtraction value is " + apple);
		
		apple *=9;
		System.out.println("The apple Multiplication value is" + apple);
		
		apple /=9;
		System.out.println("The apple Division value is " + apple);
	}

}
