package first;

import java.util.Scanner;

public class IfStatement7 {

	
	
	public static void main(String[] args) {
		System.out.println("Enter any number");
		
		Scanner input = new Scanner(System.in);
          
		int x=input.nextInt();
		
		if  (x<=20){
			System.out.println("You are an ordinary person ");
		}else {
			System.out.println("You are an Extra-ordinary person you think different from others");
		}
	}

}
