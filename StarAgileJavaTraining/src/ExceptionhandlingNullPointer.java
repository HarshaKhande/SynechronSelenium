
public class ExceptionhandlingNullPointer {
	
	public void nullpointer() {
		
		try {
		
		String s = null;
		
		System.out.println(s.length());
		
	}catch (Exception e) {
		
		System.out.println(e);
	}
		
	}

	public static void main(String[] args) {
		
		ExceptionhandlingNullPointer obj = new ExceptionhandlingNullPointer();
		
		obj.nullpointer();



	}

}
