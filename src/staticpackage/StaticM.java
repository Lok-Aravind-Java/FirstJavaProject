package staticpackage;

public class StaticM {

	public static void main(String[] args) {

		Statictuna m1 = new Statictuna("anushka","Shetty");
		Statictuna m2 = new Statictuna("Samantha","Prabhu");
		Statictuna m3 = new Statictuna("gal","gadot");
	
	System.out.println("------------------------------------------------");
	
	System.out.println(m1.getFirst());
	System.out.println(m1.getLast());
	System.out.println(Statictuna.getMembers());
	
	System.out.println(m2.getFirst());
	System.out.println(m2.getLast());
	System.out.println(m2.getMembers());
	
	System.out.println(m3.getFirst());
	System.out.println(m3.getLast());
	System.out.println(m3.getMembers());
	
	}

}
