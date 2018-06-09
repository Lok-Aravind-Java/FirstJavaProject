package enumeratin;

public enum EnumerVariable {
	
	ALLUARJUN("Style","31"),
	mahesh("Handsome","41"),
	prabhas("GOOD", "37"),
	jrntr("dance","32"),
	rajinikath("thalaiva","66"),
	kamalhassan("acting","62");
	
	private final String desc;
	private final String age;
	
    EnumerVariable(String description, String year){
		desc = description;
		age = year;
			}
	
	public String todesc(){
		return desc;
	}
	

	public String toage(){
		return age;
	}

}
