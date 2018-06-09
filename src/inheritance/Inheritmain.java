package inheritance;

public class Inheritmain {

	public static void main(String[] args) {

		Rectangle rec = new Rectangle();
		Triangle tri = new Triangle();
		
		
		rec.setvalues(10, 20);
		rec.Area();
		
		tri.setvalues(5, 5);
		tri.area();
	}

}
