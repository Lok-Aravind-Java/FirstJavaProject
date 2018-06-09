package iostram;

import java.io.IOException;

public class CloseClass implements AutoCloseable  {

	public void saySomething() throws IOException {
		throw new IOException("throw IOException something");
		// System.out.println("Printed Something");
	}
	
	@Override
	public void close() throws IOException {
	
		 throw new IOException(" throw IOException");
		//System.out.println(" closed the case ");
		
	}
	

}
