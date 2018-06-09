package polymorphism;

public class PolyMain {

	public static void main(String[] args) {
	
		/*Poly1 arav = new Ploy2();
		Poly1 aravi = new Poly3();*/
		
		
		Poly1 ara[] = new Poly1[2];
	
		ara[0] = new Ploy2();
		ara[1] = new Poly3();
		
		for(Poly1 x : ara){
			x.drink();
		}
		//(or)
		for (int x = 0; x < ara.length ; x++ ){
			ara[x].drink();
		}
	
	}

}
