
public class ArrayOutofBoundException {
	

	public void arrayoutbound() {
		
		try {
		
			int a [] = new int[5];
			
			a[10] = 89;

	}catch (Exception e) {
		
		System.out.println(e);
	}
		
	}

	public static void main(String[] args) {
		ArrayOutofBoundException obj = new ArrayOutofBoundException();
		
		obj.arrayoutbound();

	}

}
