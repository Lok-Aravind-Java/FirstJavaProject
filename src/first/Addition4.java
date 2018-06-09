package first;

import java.util.Scanner;
public class Addition4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double firstnumber, secondnumber, total;
		System.out.println("Ente the First Number");
		firstnumber = input.nextDouble();
		
		System.out.println("Enter the Second Number");
		secondnumber = input.nextDouble();
		
		total= firstnumber + secondnumber;
		
		System.out.println("The addition of First number and Second Number is " + total);
	}

}
