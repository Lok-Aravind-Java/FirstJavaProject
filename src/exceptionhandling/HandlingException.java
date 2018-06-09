package exceptionhandling;

public class HandlingException {

	public static void main(String[] args) {
		
		int i =12;
		int j = 2;
		
		try{
		int result = i/(j-2);
		System.out.println(result);
		}catch(Exception e){
			System.out.println("Error : " + e.getMessage());
			e.printStackTrace();
		}
		

	}

}
