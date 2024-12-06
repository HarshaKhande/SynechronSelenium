
public class MultipleInheritanceChildClass implements Printable,Showable {

	public void show() {

		System.out.println("Showing in child class");

	}

	public void print() {

		System.out.println("Printing in child class");
	}

	public static void main(String[] args) {
		
		MultipleInheritanceChildClass obj = new MultipleInheritanceChildClass(); 
		
		Printable iRefP = new MultipleInheritanceChildClass(); 
		
		Showable iRefS = new MultipleInheritanceChildClass(); ;
		
		iRefS.show();
		
		iRefP.print();
		
		

	}

}
