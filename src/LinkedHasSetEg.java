import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHasSetEg {

	public static void main(String[] args) {
		
		LinkedHashSet<Float> v = new LinkedHashSet<Float>();
		
		// no insertion order maintianed 
		
		// no duplicate values allwoed 
		
		// null values allowed
		
		// non synchronized
		
	    // create a hash set
			
			v.add(7.8f);
			
			v.add(9.6f);
			
			v.add(8.4f);
			
			v.add(9.4f);
			
			v.add(12.3f);
			
			v.add(9.4f);
			
			v.add(null);
			
			System.out.println(v);
			



	}

}
