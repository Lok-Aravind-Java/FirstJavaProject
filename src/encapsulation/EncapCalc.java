package encapsulation;

public class EncapCalc {

	private double leftval;
	private double rightval;
	private char opcode;
	private double result;
	
	public double getLeftval() {
		return leftval;
	}

	public void setLeftval(double leftval) {
		this.leftval = leftval;
	}

	public double getRightval() {
		return rightval;
	}

	public void setRightval(double rightval) {
		this.rightval = rightval;
	}

	public char getOpcode() {
		return opcode;
	}

	public void setOpcode(char opcode) {
		this.opcode = opcode;
	}

	public double getResult() {
		return result;
	}
	
	public void execute(){
		
		switch (opcode){
		case 'a' : 
			result = leftval + rightval;
			break;
		case 's':
			result = leftval - rightval;
			break;
		case 'd' :
			result =  (rightval>0) ?  leftval/rightval : 0.0d ;
			break;
		case 'm':
			result =leftval*rightval;
			break;
		default:
			result = 0.0d;
			break;
		}
	}
}