package filescreation;
import java.io.FileNotFoundException;
import java.util.Formatter;
public class Filem1 {
	
	private Formatter x;
	
	public void FileCreating(){
		
		try {
		x = new Formatter("Fileabc.txt");
		System.out.println("New Fileabc.txt is created");
		}
		catch(FileNotFoundException s){
			s.printStackTrace();
			System.out.println("Sorry file is not found");
		}	
	}
	
	public void FileRecord(){
		x.format("%s", "this is going to have the content which i write");
				
	}

	public void FileClose(){
		x.close();
	}
}
