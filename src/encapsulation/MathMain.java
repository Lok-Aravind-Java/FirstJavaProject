package encapsulation;

public class MathMain {

	public static void main(String[] args) {
		
     MathCalc[] math = new MathCalc[4];
      math[0]=create(100.00,25.00,'d');
     math[1] = create(136.00,56.77,'a');
     math[2] = create(11.00,3.0,'m');
     math[3] = create(80.00,20.00,'d');
     
		 for(MathCalc ma : math){
			 ma.execute();
			 System.out.print("The Result = ");
			 System.out.println(ma.result);
		 }
	}
	
	public static MathCalc create(double leftval , double rightval, char opcode){
              MathCalc mat = new MathCalc();
              mat.leftval = leftval;
              mat.rightval = rightval;
              mat.opcode = opcode;
              
              return mat;
	}

}
