
public class Throwkeyword {
	
	
	
	public void validateage(int age ) throws InterruptedException  {
		
		Thread.sleep(70);
			
		if(age < 18) {
			
			throw new ArithmeticException("Person is not eligible for voting");
		}else {
			
			System.out.println("Person is eligible for voting");
		}
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		Throwkeyword obj = new Throwkeyword();
		
		obj.validateage(16);


	}

}
