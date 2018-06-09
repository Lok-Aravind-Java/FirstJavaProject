package genereics;

public class GenericsMethod<T> {
	private T t;
	
	private void add(T t){
		this.t= t;
	}
	
	private T get(){
		return t;
	}

	public static void main(String[] args) {
		GenericsMethod<Integer> integerbox = new GenericsMethod<Integer>();
		GenericsMethod<String> stringbox = new GenericsMethod<String>();
		
		integerbox.add(new Integer(10));
		stringbox.add(new String("Hello World"));
		
		System.out.printf("%s",integerbox.get());
		System.out.println();
		System.out.printf("%s",stringbox.get());

	}

}
