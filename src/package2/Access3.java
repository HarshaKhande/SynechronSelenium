package package2;

import package1.Access1;

public class Access3 extends Access1{
	
	public void display() {
		
		System.out.println("displaying");
	}
	
	public static void main(String[] args) {

		Access1 a1 = new Access1();
		
		Access3 a3 = new Access3();
		
		System.out.println(a1.hours);
		
		System.out.println(a1.minutes);
		
		System.out.println(a3.id);
		





	}

}
