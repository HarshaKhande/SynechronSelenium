
public class HierarchialChild2 extends HierarchialParent{
	
String S2 = "selenium";
	
	public void access() {
		
		System.out.println("accessing  in Child class 2 " + S2);
	}

	public static void main(String[] args) {
		
		HierarchialChild2 obj = new HierarchialChild2();
		
		obj.displaycolor();
		
		obj.access();
		
		
		
		



	}

}
