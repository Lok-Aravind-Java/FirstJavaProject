package collections;
import java.util.*;
public class StackPushPop {

	public static void main(String[] args) {
	
		Stack<String> stk = new Stack<String>();
		stk.push("Bottom");
		Prntstack(stk);
		stk.push("second");
		Prntstack(stk);
		stk.push("First");
		Prntstack(stk);
		
		stk.pop();
		Prntstack(stk);
		stk.pop();
		Prntstack(stk);
		stk.pop();
		Prntstack(stk);
		
	}
	
	private static void Prntstack(Stack<String> s){
		
		if(s.isEmpty()){
			System.out.println("your stack is empty");
			
		}else{
			System.out.printf("%s TOP \n", s);
		}
		
	}

}
