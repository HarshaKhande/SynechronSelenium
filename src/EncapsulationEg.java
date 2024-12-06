
public class EncapsulationEg {

	// private data member

	private String empid;

	// getter method for name

	public void getid() {

		System.out.println(empid);

	}

	// setter method for setting the name

	public void setid(String n) {

		this.empid = n;

	}

	public static void main(String[] args) {

		EncapsulationEg obj = new EncapsulationEg();

		obj.setid("John");

		obj.getid();

	}

}
