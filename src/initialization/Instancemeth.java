package initialization;

public class Instancemeth {
	
	public static void main(String[] args) {
		System.out.println("this is main");
		Instancemeth in = new Instancemeth();
		in.sys();
		
	}
	
	public void sys(){
		System.out.println("This is a normal method");
	}

	public Instancemeth(){
		System.out.println("this is abc");
	}
	{
		System.out.println("This is first");
	}
	{
		System.out.println("This is second");
	}

}
