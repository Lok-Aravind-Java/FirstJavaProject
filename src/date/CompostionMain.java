package date;

public class CompostionMain {

	private String name;
	private ToString birthday;
	
	
	public CompostionMain(String name, ToString birthday){
		this.name = name;
		this.birthday = birthday;
		
	}
	
	public String toString(){
		return String.format("my name is %s my birthday is %s", name , birthday);
	}
	

}
