
public class FunctionOverloadingEg {

	// method with 2 parameters

	public void add(int a, float b) {

		float c = a + b;

		System.out.println(c);

	}

	// method with 3 parameters

	public void add(int a, int b, int c) {

		int d = a + b + c;

		System.out.println(d);

	}

	// method with 4 parameters

	public void add(int a, int b, int c, int d) {

		int e = a + b + c + d;

		System.out.println(e);

	}

	public static void main(String[] args) {
		
		FunctionOverloadingEg obj = new FunctionOverloadingEg();
		
		obj.add(2, 3);
		obj.add(4, 5, -1);
		obj.add(7, 5, -2, -5);

	}

}
