package package1;

import package2.Access3;

public class Access2 {
	
	
	
	public static void main(String[] args) {

		Access1 a1 = new Access1();
		
		Access3 a3 = new Access3();
		
		System.out.println(a1.hours);
		
		System.out.println(a1.minutes);
		
		a3.display();
		
		System.out.println(a1.age);
		
		System.out.println(a1.id);
		



	}

}
