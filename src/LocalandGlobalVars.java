
public class LocalandGlobalVars {
	
	// global variable 
	
	String collegeName = "BMSIT";
	
	public void getstudentdetails() {
		
		// local variables 
		
		String StudentName = "John";
		
		int  StudentID = 57887;
		
		System.out.println("The student name is " + StudentName);
		
		System.out.println("The student ID is " + StudentID);
		
		System.out.println("The college Name  is " + collegeName);
		
	}
	
	public static void main(String[] args) {
		
		LocalandGlobalVars obj = new LocalandGlobalVars();
		
		obj.getstudentdetails();
		
		System.out.println(obj.collegeName);
		
	}

}
