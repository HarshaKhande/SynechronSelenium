
public class IfElseLadderEg {
	
	public void ladder() {
		
		int i = 20;
		
		// condition 1
		
		if ( i == 10 ) {
			
			System.out.println("I is 10");
			
		}else if (i == 15) {
			
			System.out.println("I is 15");
			
		}else if (i == 20) {
			
			System.out.println("I is 20");
		}else {
			
			System.out.println("Invalid data");
		}
		
		
		
	}

	public static void main(String[] args) {

		IfElseLadderEg obj = new IfElseLadderEg();
		
		obj.ladder();
				

	}

}
