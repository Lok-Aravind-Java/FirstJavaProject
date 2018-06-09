package objectReference;

public class ObjectClass {


public ObjectClass(){
		this(6);	
		System.out.println("This is a conr");	
	}
	
	public ObjectClass(int a){
		
		System.out.println("This is a constructor"+a);	
	}
public void abc(){
	
	System.out.println(this);
	
}
	public static void main(String[] args) {
		ObjectClass obj = new ObjectClass();
 		

	}

	public String  toString(){
		return "abc";
	}
 }
