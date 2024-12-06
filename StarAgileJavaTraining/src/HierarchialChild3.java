
public class HierarchialChild3 extends HierarchialParent {
	
String S3 = "java";
	
	public void area() {
		
		System.out.println("area  in Child class 3 " + S3);
	}

	public static void main(String[] args) {
		
		HierarchialChild3 obj = new HierarchialChild3();
		
		obj.displaycolor();
		
		obj.area();
		
	}

}
