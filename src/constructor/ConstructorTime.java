package constructor;

public class ConstructorTime {
	
   private int hour,minute,second;
   
   public ConstructorTime(){
	   this(0,0,0);
	   
   }
    public ConstructorTime(int h){
    	this(h,0,0);
	   
   }
    public ConstructorTime(int h,int m){
	   this(h,m,0);
 }
     public ConstructorTime(int h,int m,int s){
    	 Sethour(h);
    	 Setminute(m);
    	 Setsecond(s);
 }
     public void Sethour(int h){
    	 hour = ((h>=0 && h<=24) ? h : 0);
     }
     public void Setminute(int m){
    	 minute = ((m >0 && m<=60) ? m : 0);
    	
     }
     public void Setsecond(int s){
	      second = ((s>=0 && s<=60) ? s : 0);
}
     
     public int Gethour(){
    	return hour; 
     }
      public int Getminute(){
    	 return minute;
     }
       public int Getsecond(){
	   return second;
}
       
       public String ToMilitary(){
    	   return String.format("%02d:%02d:%02d",Gethour(),Getminute(),Getsecond());
       }
}
