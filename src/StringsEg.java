
public class StringsEg {

	public static void main(String[] args) {
		
		String S1 = "New Delhi";
		
		String S2 = "Chennai";
		
		// equals
		
		System.out.println(S1.equals(S2));  // false
		
		// concatenation
		
		System.out.println(S1.concat(S2)); // New DelhiChennai
		
		// substring 
		
		System.out.println(S1.substring(4)); // 
		
		// subtstring with 2 indexes
		
		System.out.println(S1.substring(0, 3));
		
		// contains
		
		System.out.println(S1.contains("z"));// false
		
		// ends with 
		
		System.out.println(S1.endsWith("i"));
		
		// replace
		
		System.out.println(S1.replace("N", "B"));
		
		// replace all
		
		System.out.println(S1.replaceAll("New", "Old"));
		
		// Join
		
		System.out.println(S1.join("_", "New","Delhi"));
		


	
		
		
		
		
		
		
		
		
		
		
		
		



	}

}
