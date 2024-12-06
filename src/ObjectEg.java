
public class ObjectEg {
	
	// object is a real time which consists of data and methods
	
	// data of the employee 
	
	String empname = "Ravi";
	
	String empBU = "HR";
	
	
		// TODO Auto-generated method stub
	
	// methods of the object employee
	
	// method not returning nay value is void method 
	
	public void empdetails() {
		
		int a = 7;
		
		int b = 9;
		
		int c = a + b;
		
		System.out.println(c);
		
		
		
		System.out.println("The employee Ravi belongs to city Bangalore");
		
	}
	
	public static void main(String[] args) {
		
		// create the object of the class to access the data and methods defined in the class file
		ObjectEg obj = new ObjectEg(); 
	
		
		obj.empdetails();
		
		// this will ptrint the string empname
		
		System.out.println(obj.empname);
		
		// this will print the string empBU
		
		System.out.println(obj.empBU);
		
		
		


	}

}
