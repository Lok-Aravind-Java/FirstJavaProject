package arrayholdingobjects;

public class AnimalList {
	
	private Animal theList[] = new Animal[6];
	private int i = 0;
	
	public void add(Animal a){
		if(i<theList.length){
			theList[i]=a;
			System.out.println("Animal is added to the Index"+ i);
			i++;
		}
		
	}

}
