package first;

import java.util.Scanner;

public class Mounika {

	public static void main(String[] args) {
		System.out.println("If you want to create an Email ID Enter 1 ");
		System.out.println("If you want to Sign In Email ID Enter 2 ");
		
		Scanner input = new Scanner(System.in);
		
		
		switch (input.nextInt()){
		case 1: System.out.println("Enter your First Name and Last Name");  
		        System.out.println(input.nextLine());
		        System.out.println("Enter your User ID");  
		        System.out.println(input.nextLine());
		        System.out.println("Enter your Password");  
                System.out.println(input.nextLine());
                System.out.println("Enter your Password once again");  
                System.out.println(input.nextLine());
		        break;
		case 2: System.out.println("Enter your Email ID");  
                System.out.println(input.nextLine());
                System.out.println("Enter your password");  
                System.out.println(input.nextLine());
                break;
        
		default : System.out.println("Your selection is wrong");
		         break;
		}
		
		
	

	}

}
