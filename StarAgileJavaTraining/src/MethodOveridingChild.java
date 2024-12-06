
public class MethodOveridingChild extends MethodOveridingParent{

	public void run () {
		
		String S1 = "hello Mumbai";
		
		System.out.println(S1);
	}
	
	
	public static void main(String[] args) {

		MethodOveridingChild obj = new MethodOveridingChild();
		
		EncapsulationEg en = new EncapsulationEg();
		
		
		
		obj.run();

	}

}
