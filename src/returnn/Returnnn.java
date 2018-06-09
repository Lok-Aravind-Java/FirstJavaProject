package returnn;

public class Returnnn {
	
	int sum;
	public Returnnn(float x,float y,int count){
      
		if(count<1){
			return;
		}
		
		sum = (int)(x+y);
        
		for(int i=0;i<count;i++){
        	  System.out.println(sum);
          }
         
          return;
	}

}
