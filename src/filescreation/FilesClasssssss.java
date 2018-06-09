package filescreation;
import java.io.File;
public class FilesClasssssss {

	public static void main(String[] args) {

		File fil = new File("C:\\Users\\Aravind Paluvadi\\workspace\\Java\\abc.txt");
		
		if(fil.exists()){
			System.out.println(fil.getName() + " exits ");
		}else{
			System.out.println("This file does'nt exits");
		}
		
		
	}

}
