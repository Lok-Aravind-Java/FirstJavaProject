package arrayholdingobjects;

public class DogList {
	
	private Dog theList[] = new Dog[3];
	 int i = 0;
	 
	 
	 public void add(Dog d ){
		 if( i<theList.length){
			 theList[i] = d ;
			 System.out.println("The new dog object is added at index " + i);
			 i++;
			 
		 }
	 }
}
