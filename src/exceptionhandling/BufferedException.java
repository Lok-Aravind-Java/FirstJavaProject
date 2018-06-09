package exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedException {

	static BufferedReader reader = null ;
	static int total = 0;
	
	public static void main(String[] args) {
		
		try{
		reader = new BufferedReader(new FileReader("dcd.txt"));
		String line;
		while( (line = reader.readLine()) != null ){
			total += Integer.parseInt(line);
			
		}
		System.out.println("Total : " + total);
		}catch(Exception e ){
			System.out.println(e.getMessage());
		}finally{
			try{
			if(reader !=null){
			reader.close();
			}
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
			}
		}
	
	}


