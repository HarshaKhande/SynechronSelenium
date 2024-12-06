
public interface Printable {
	
	// abstract
	
	public  void print () ;
	
	// static method
	
	static void show() {
		
	}
	
	// default method 
	
	default void read() {
		
		System.out.println("reading");
	}

	
	


}
