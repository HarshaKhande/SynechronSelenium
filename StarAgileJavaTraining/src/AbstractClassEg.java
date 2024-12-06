
public abstract class AbstractClassEg {

	// abstract classes by default are public in nature.
	
	// abstract classes cannot be instantiated , cannot create the object of the abstract class

	String empname = "Ravi";

	static int empid = 78898;

	final int empbuid = 8;
	
	static void show() {
		
		System.out.println("Showing static data in abstract class");
	}

	// abstract method only allow method signature. no method body

	abstract void write();

	// non abstract method

	public void read() {

		System.out.println("Reading in abstract class");
	}
	
	
	

}
