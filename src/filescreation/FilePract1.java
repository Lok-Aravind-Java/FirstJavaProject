package filescreation;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
public class FilePract1 {

	public static void main(String[] args) {
		File f = new File ("abc.txt");
		
		if (!f.exists() ){
			try {
				f.createNewFile();
		
			PrintWriter pp = new PrintWriter(f);
			pp.println(" This has some special content ");  
			pp.println(100000000);
			pp.close();
			  System.out.println("done");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
