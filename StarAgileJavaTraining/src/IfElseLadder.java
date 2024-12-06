
public class IfElseLadder {

	public static void main(String[] args) {
		
		int marks = 10001;
		
		if (marks !=0 &&  marks <50) {
			
			System.out.println("Pass class");
			
		}else if (marks >=50 && marks <60 ) {
			
			System.out.println("Second class");
			
		}else if (marks >=60 && marks <70 ) {
			
			System.out.println("First class");
			
		}else if (marks >=70 && marks < 100 ) {
			
			System.out.println("Distinction class");
			
		}else {
			
			System.out.println("Invalid marks ");
			
			
		}
		



	}

}
