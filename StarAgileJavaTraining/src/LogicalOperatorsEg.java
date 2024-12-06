
public class LogicalOperatorsEg {
	
	
	public void log() {
		
		// && operator 
		
		System.out.println((5 >3) && (8 > 5)); // true 
		
		System.out.println((5 > 3) && (8 < 5));// false
		
		// || or operator 
		
		System.out.println((5 > 3) || (8 >5)); // true 
		
		System.out.println((5 < 3) || (8 <5)); // false 
		
		System.out.println((5 > 3) || (8 < 5)); // true 
		
	}

	public static void main(String[] args) {
		
		LogicalOperatorsEg obj = new LogicalOperatorsEg();
		
		obj.log();



	}

}
