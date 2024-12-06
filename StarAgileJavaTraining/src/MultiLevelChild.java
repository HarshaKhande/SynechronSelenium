
public class MultiLevelChild extends MultiLevelParent2{

	String S3 = "selenium";

	public void display() {

		System.out.println("Displaying  in child class");
	}

	public static void main(String[] args) {

		MultiLevelChild obj = new MultiLevelChild();

		System.out.println(obj.S1);

		System.out.println(obj.S2);

		System.out.println(obj.S3);

		obj.write();

		obj.read();

		obj.display();

	}

}
