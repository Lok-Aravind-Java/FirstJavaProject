package instaces;

public class ManyMethods {

	private String girlname;
	 public void Setname(String Name){
		 girlname = Name;
	 }
	 
	 public String Getname(){
		 return girlname;
	 }
	
	public void saying(){
		System.out.printf("Your lover name is %s", Getname());
	}

}
