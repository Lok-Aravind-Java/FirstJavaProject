package filescreation;
import java.io.*;
public class ReadFile {

	public static void main(String[] args) {
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("abc.txt"));
		     String line;
		     
		     while((line = br.readLine()) != null){
		    	 System.out.println(line);
		     }
		
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

	}

}
