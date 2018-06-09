package iostram;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputStreamclass {
	
static File x;

	public static void main(String[] args) {
		
			 x = new File("appt.txt");
		 
			 try {
				 if(x.exists()){
				x.createNewFile();
				System.out.println("File created");
				 }
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			 
			 int length;
			 char[] buff = new char[8];
			 
			 
			try(FileReader read = new FileReader("appt.txt")){
				
				while((length = read.read(buff))>=0){
					System.out.println("length : " + length);
				
					for(int i = 0 ; i<length ;i++){
						System.out.print("\t"+buff[i]);
						
					}
					System.out.println();
				
				}
				
				
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			
			
			
			///////AutoClosable interface implemented//////////////
			try(CloseClass cc = new CloseClass()){
				
				cc.saySomething();
				
			}catch(IOException e){
				System.out.println(e.getClass().getSimpleName() +"-"+ e.getMessage());
			
			/////To show all the unshown or supressed exceptions/////////////////
			
				for(Throwable t : e.getSuppressed()){
					System.out.println("Supressed : " + t);
				}
			
			}
			 
	}

}
