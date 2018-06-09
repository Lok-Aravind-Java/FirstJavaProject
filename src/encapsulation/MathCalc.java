package encapsulation;

public class MathCalc {
	
	public double leftval;
	public double rightval;
	public char opcode;
	public double result;
	
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
