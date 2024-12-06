
public class ParmeterizedFunction {
	
	
	public void add(int a, int b) {
		
		int c = a + b;
		
		System.out.println(c);
		
		
	}


	public static void main(String[] args) {
		
		
		ParmeterizedFunction obj = new ParmeterizedFunction();
		
		obj.add(4, 5);
		
		obj.add(-6, 5);
		
		obj.add(7,  -9);
		
		obj.add(-9, -6);
		
		
		


	}

}
