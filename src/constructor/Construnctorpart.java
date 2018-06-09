package constructor;

public class Construnctorpart {
	
	private String girlname;
	
	public Construnctorpart(String Name){
		girlname= Name;
		
	}

	
	public String GetName(){
		return girlname;
		
	}
  public void saying (){
	  
	  System.out.printf("Your girl friend name is : %s", GetName());
  }
}

