package com.apptrics.javabasics;

public class BinarySort {

	public static void main(String[] args) {
		 int  count = 0, a,max=0;
	        int [] array = {3,2,5,7,10};
	        
	        String x = "";
	        for(int i:array) {
	        	int num = i;
		        while(i > 0)
		        {
		            a = i % 2;
		            if(a == 1)
		            {
		                count++;
		            }
		            x = a+x + "" ;
		            i = i / 2;
		        }
		      
		        count = 0;
		        x="";
		 	
	        }

	}

}



/*
class MyObject implements Comparator{
    int numbers;
    int onesCount;
    
     MyObject(int numbers,int onesCount){
      this.numbers = numbers;
      this.onesCount = onesCount;
    }
  
  @Override
  public int compare(MyObject o1,MyObject o2){
    //if (o1
  
    		return 0;
  }
      
  }*/
