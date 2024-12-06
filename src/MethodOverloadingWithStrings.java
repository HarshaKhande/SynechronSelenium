
public class MethodOverloadingWithStrings {
	
	// method with 2 parameters
	
	public void m1(String S1, String S2) {
		
		String S3 = S1 + S2;
		
		System.out.println(S3);
		
	}
	
	// method with 3 parameters 
	
	
 public void m1(String S1, String S2 , int S3) {
		
		String S4 = S1 + S2 + S3;
		
		System.out.println(S4);
		
	}

	public static void main(String[] args) {
		
		MethodOverloadingWithStrings obj = new MethodOverloadingWithStrings();
		
		obj.m1("Hello", "World");
		
		obj.m1("New", "Delhi", 8);


	}

}
