package inheritance;

public class Triangle extends Polygon{
 
	private int sum;
	
	public void area (){
		
		sum = (height*width)/2;
		
		System.out.println("The Area of a Triange is " + sum);
	}
	
	
}
