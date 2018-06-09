package string;

public class StringTime {

	public static void main(String[] args) {
       
		 //String
		long StartTime1 = System.currentTimeMillis();
		for(int i = 0 ;i < 500000 ; i++  ){
			String s1 = "The Time" + "Taken";
		    String s2 = "Say" + " Hello";
		}
		long EndTime1 = System.currentTimeMillis();
		System.out.println("The time taken by String is " + (EndTime1 - StartTime1) + "ms");
		 
		//StringBuffer 
		long StratTime2 = System.currentTimeMillis();
		for(int i=0 ; i < 500000 ; i ++){
			StringBuffer sb = new StringBuffer();
			sb.append("The");
			sb.append("Time");
			sb.append("taken");
		}
		long EndTime2 = System.currentTimeMillis();
		System.out.println("The time take by StringBuffer is "+ (EndTime2 - StratTime2) + " ms ");
		
		//String Builder
		 long StartTime3 = System.currentTimeMillis();
		 for(int i = 0 ; i<500000;i++){
			 StringBuilder sb1 = new StringBuilder("The time");
			 sb1.append("The");
			 sb1.append("Time");
			 sb1.append("taken");
			}
		 long EndTime3 = System.currentTimeMillis();
		 System.out.println("The time take BY StringBuilder is "+ (EndTime3 - StartTime3) +" ms ");
	}

}