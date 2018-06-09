package first;
import java.util.Scanner;
public class SimpleAveraging {

	public static void main(String[] args) {
    System.out.println("Enter any 10 numbers");
		Scanner input = new Scanner(System.in);
    
     double total=0,counter=0,grade,average;
     
     while(counter<10){
    	 
    	 grade = input.nextInt();
    	 total= total + grade;
    	 counter++;
    	 
     }
     average = total/10;
     System.out.println("The average is :" + average);
	}

}
