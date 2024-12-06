
public class AbstractChildClassEg extends AbstractClassEg{
	
	public void write() {

		System.out.println("writing in child abstract class");
		
	}


	public static void main(String[] args) {
		
		AbstractClassEg aref = new AbstractChildClassEg();
		
		System.out.println(aref.empbuid);
		
		System.out.println(aref.empname);
		
		aref.read();
		
		aref.write();
		
		show();

		
		
		
		


	}

	
	
}
