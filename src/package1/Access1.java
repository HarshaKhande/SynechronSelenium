package package1;

import package2.Access3;

public class Access1 {
	
	// public  access specifier has the 
	//accessibility in all the classes and packages in the project
	
	// private - only inside the class 
	
	// default - no keyword required , they are accessible within the same pacakage
	
	// protected  - same package or subclasses in in different packages 
	
	public int hours = 56;
	
	public int minutes = 6;
	
	private int seconds = 78;
	
	int age = 45;
	
	protected int id = 7899;
	
	

	public static void main(String[] args) {

		Access1 a1 = new Access1();
		
		Access3 a3 = new Access3();
		
		System.out.println(a1.hours);
		
		System.out.println(a1.minutes);
		
		a3.display();
		
		System.out.println(a1.seconds);
		
		System.out.println(a1.age);
		
		System.out.println();

	}

}
