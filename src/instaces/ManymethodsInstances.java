package instaces;
import java.util.Scanner;
public class ManymethodsInstances {

	public static void main(String[] args) {
		 
		 Scanner input = new Scanner(System.in);
		 ManyMethods tuna = new ManyMethods();
		 
		 System.out.println("Enter the girl or boy name you like :");
		 
		 String temp = input.nextLine();
		 
		 tuna.Setname(temp);
		 tuna.saying();
	}

}
