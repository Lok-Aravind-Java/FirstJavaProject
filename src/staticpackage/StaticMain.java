package staticpackage;

public class StaticMain {

	public static void main(String[] args) {

		StaicMethods hello = new StaicMethods();
		
		hello.Donothing();
		hello.Dosomething();
		StaicMethods.Dosomething();
		
		//------------------------------------------
		System.out.println("-------------------------------------------------------------------");
		
		
		StaicSharing tom = new StaicSharing();

		System.out.println(tom.GetStudents());
		
		StaicSharing zack = new StaicSharing();

		System.out.println(zack.GetStudents());
		
		
		
		System.out.println(StaicSharing.GetStudents());
		
		
		
		
	}

}
