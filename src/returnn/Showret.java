package returnn;

public class Showret {

	public static void main(String[] args) {
		show(5);
		show(0);

	}
	
	public static void show(int i ){
		if(i>0){
			System.out.println("not zero");
		return;
		}
		
		System.out.println("zero");
		return;
		
		
	}

}
