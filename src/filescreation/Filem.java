package filescreation;
import java.io.File;
import java.util.Scanner;
public class Filem {
	
	private Scanner x;
	
	public void File(){
		  try {
		x = new Scanner (new File("dcd.txt"));
		  }catch(Exception e){
			  e.printStackTrace();
		  }
	}
	
	public void readfile(){
		while(x.hasNext()){
			String a = x.next();
			String b = x.next();
			String c = x.next();
		  
		System.out.printf("%s %s %s" , a ,b ,c);	
 		}
	}
	
	public void FileClosee(){
		x.close();
	}
	
}
