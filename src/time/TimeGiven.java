package time;

public class TimeGiven {

	private int hour,minute,second;
	
	public void Settime(int h,int m,int s){
		
		hour = ((h>=0 && h<=24) ? h : 0);
		minute = ((m>=0 && m<=60) ? m : 0);
		second = ((s>=0 && s<=60) ? s : 0);
		
		
	}
	
	public String toMilitary(){
		 /* System.out.printf("%02d :",hour);
		  System.out.printf("%02d :",minute);
		  System.out.printf("%02d",second);*/
				
				 return String.format("%02d:%02d:%02d", hour,minute,second);
	}
	
}
