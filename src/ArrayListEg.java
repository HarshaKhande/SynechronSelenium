import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args) {
		
		// maintains the insertion order
		
		// allows duplicate values 
		
		// allows null values 
		
		// non synchronized
		
		ArrayList<String> list = new ArrayList<String>();
		
		// create a array list 
		
		list.add("John");
		
		list.add("Ravi");
		
		list.add("Tina");
		
		list.add("John");
		
		list.add(null);
		
		System.out.println(list);
		
		list.remove(1);
		
		System.out.println(list);
		
		


	}

}
