
public class SuperEgChild extends SuperEg{
	
	String color = "red";
	
	public void displaycolor() {
		
		System.out.println(color);
		
		System.out.println(super.color);
		
		System.out.println(super.age);
		
		super.access();
		
	}

	
	public static void main(String[] args) {
		
		SuperEgChild obj = new SuperEgChild();
		
		obj.displaycolor();


	}

}
