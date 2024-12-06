import java.util.Scanner;

public class HierarchialChild1 extends HierarchialParent {

	String S1 = "testing";

	public void print() {

		System.out.println("Printing in Child class 1 " + S1);
	}

	public static void main(String[] args) {

		HierarchialChild1 obj = new HierarchialChild1();

		obj.displaycolor();

		obj.print();

	}

}
