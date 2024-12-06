
public class CheckEvenOrOdd {
	
	public void checkevenodd(int n) {
		
		if (n % 2 == 0) {
			
			System.out.println("The number " + " " + n + " is a even number ");
			
		}else {
			
			System.out.println("The number " + " " + n + " is a odd number");
		}
		
	}
	

	public static void main(String[] args) {
		
		CheckEvenOrOdd obj = new CheckEvenOrOdd();
		
		obj.checkevenodd(4);
		
		obj.checkevenodd(7);
	}

}
