
public class IfEg {
	
	// function parameters 
	
	public void validateage(int age ) {
		
	// age checking for voting 
		
		if (age >= 18) {
			
			System.out.println("The person is eligible for voting");
			
		}else {
			
			
			System.out.println("The person is not eligible for voting");
		}
		
		
	}

	public static void main(String[] args) {
		
		IfEg obj = new IfEg();
		
		obj.validateage(17);
		
		obj.validateage(18);
		
		obj.validateage(21);
		
		obj.validateage(2);



	}

}
