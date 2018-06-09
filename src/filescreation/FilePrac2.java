package filescreation;
import java.io.FileNotFoundException;
import java.util.Formatter;
public class FilePrac2 {

	public static void main(String[] args) {
		
		final Formatter x;
		
		try {
			x = new Formatter("dcd.txt");
			System.out.println("New file is created ");
			
			x.format("%s %s %s ", " 20 " , " Mounika " , " BWW ");
			x.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	
	}

}
