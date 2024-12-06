import java.util.Stack;

public class StackEg {

	public static void main(String[] args) {
		
		Stack<Integer> stk = new Stack<Integer>();
		
		stk.push(78);
		
		stk.push(67);
		
		stk.push(45);
		
		stk.push(44);
		
		stk.peek();
		
		System.out.println(stk);
		
		boolean result = stk.isEmpty();
		
		stk.pop();
		
		System.out.println(stk);
		
		
		
		
		


		

	}

}
