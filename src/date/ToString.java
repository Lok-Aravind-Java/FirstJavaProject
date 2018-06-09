package date;

public class ToString {
	
	private int day,month,year;
	
	public ToString(int d, int m, int y){
		day = d;
		month = m;
		year = y ;
		
		System.out.printf("The date is : %s\n ",this);
		
	}
	
	
   public String toString(){
	   return String.format("%d/%d/%02d", day, month , year);
   }
}
