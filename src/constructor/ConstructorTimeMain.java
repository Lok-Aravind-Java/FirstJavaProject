package constructor;

public class ConstructorTimeMain {

	public static void main(String[] args) {
		
		ConstructorTime abc = new ConstructorTime();
		ConstructorTime abc1 = new ConstructorTime(5);
		ConstructorTime abc2 = new ConstructorTime(5,14);
		ConstructorTime abc3 = new ConstructorTime(5,15,25);

		System.out.printf("%s\n",abc.ToMilitary());
		System.out.printf("%s\n",abc1.ToMilitary());
		System.out.printf("%s\n",abc2.ToMilitary());
		System.out.printf("%s\n",abc3.ToMilitary());
	}

}
