package returnn;

public class RetFlyM {

	public static void main(String[] args) {
		FlyRet f1 = new FlyRet();
		FlyRet f2 = new FlyRet();
		
		FlyRet f3;
		
		if(f1.type(f2)){
			f3 = f1.type1(f2);
		System.out.println("complete");
		}

		
	}

}
