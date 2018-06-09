package constructor;

public class FlightClass {

	public static void main(String[] args) {
		
		Flight fly1 = new Flight();
		Flight fly2 = new Flight();
		
		fly2.add1passenger();
		System.out.println(fly2.passengers);
		fly2=fly1;
		
		System.out.println(fly2.passengers);
		fly1.add1passenger();
		fly1.add1passenger();
		
		System.out.printf("%d",fly2.passengers);

	}

}
