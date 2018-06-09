package methods;

import java.util.Scanner;

public class Methodswithparamets {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Parameters tuna = new Parameters();
		
		
		System.out.println(" Enter your Name: ");
		
		String Name = input.nextLine();
		tuna.SimpleMessage(Name);

	}

}
