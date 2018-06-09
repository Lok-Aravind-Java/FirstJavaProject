package encapsulation;

public class EncapCalcM {

	public static void main(String[] args) {
		EncapCalc[] math = new EncapCalc[4];
	     math[0]=create(100.00,25.00,'d');
	     math[1] = create(136.00,56.77,'a');
	     math[2] = create(11.00,3.0,'m');
	     math[3] = create(80.00,20.00,'d');
	     
			 for(EncapCalc ma : math){
				 ma.execute();
				 System.out.print("The Result = ");
				 System.out.println(ma.getResult());

	}
	}
				public static EncapCalc create(double leftval , double rightval, char opcode){
					EncapCalc mat = new EncapCalc();
		              mat.setLeftval(leftval);
		              mat.setRightval(rightval); 
		              mat.setOpcode(opcode);
		              
		              return mat;
			}

}
