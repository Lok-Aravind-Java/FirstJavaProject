package returnn;

public class FlyRet {
   private	int seats=5, passengers=2;
   
   
   public boolean type(FlyRet f){
	   int total = passengers+f.passengers;
	   return total<=seats ;
	   
	  }
   
   public FlyRet type1(FlyRet f){
	   
	   FlyRet fre = new FlyRet();
	   fre.passengers = passengers + f.passengers;
	   fre.seats = seats;
	
	   return fre;   
   }
   
}
