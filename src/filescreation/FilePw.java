package filescreation;
import java.io.File;
import java.io.PrintWriter;
public class FilePw {

	public static void main(String[] args) {
		
		
		try {
			File file = new File("Filename.txt");
			
			   if(!file.exists()){  
					file.createNewFile();
			   }
		    
			   PrintWriter pw = new PrintWriter(file);
		   pw.println("This file has some content");
		   pw.println(1000);
		   pw.close();
		   System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
