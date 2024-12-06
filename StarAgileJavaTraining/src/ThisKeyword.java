
public class ThisKeyword {
	
	// This keyword is used to refer to the current class variables and method parameters

	// instance variables or the global variables 
	
	public int age;
	
	public String name ;
	
	public void setage(int a) {
		
		this.age = a;
		
		System.out.println(age);
	}
	
	
	
	
	public static void main(String[] args) {
		
		ThisKeyword obj = new ThisKeyword();
		
		obj.setage(78);


	}

}
