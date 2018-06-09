package encapsulation;

public class EncapsuleMain {

	public static void main(String[] args) {
		
		Encapsule en = new Encapsule();
		en.setEid(111);
		en.setEname("arya");
		
		System.out.println(en.getEid());
        System.out.println(en.getEname());
	
        Encapsule en1 = new Encapsule();
		en1.setEid(222);
		en1.setEname("ayyaaa");
		
		System.out.println(en1.getEid());
        System.out.println(en1.getEname());
	
	}

}
