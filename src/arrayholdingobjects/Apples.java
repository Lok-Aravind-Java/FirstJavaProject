package arrayholdingobjects;

public class Apples {

	public static void main(String[] args) {
		
		DogList DLO = new DogList();
		Dog d = new Dog();
		
		DLO.add(d);
	
	System.out.println("-------------------------------");
	
	AnimalList ALO = new AnimalList();
	Dog dg = new Dog();
	Fish f = new Fish();
	    
	ALO.add(f);
	ALO.add(dg);
	
	}
}
