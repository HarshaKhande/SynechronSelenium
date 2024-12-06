
public class StaticVariableEg {

	// static variables

	static int age = 26;

	// non static variable

	String s1 = "Bangalore";

	// non static method

	public void display() {

		System.out.println("Displaying non static method ");
	}

	// static method

	static public void read() {

		System.out.println("Reading static method");
	}

	public static void main(String[] args) {

		StaticVariableEg obj = new StaticVariableEg();

		System.out.println(obj.s1);

		System.out.println(StaticVariableEg.age);

		obj.display();

	     read();

	}

}
