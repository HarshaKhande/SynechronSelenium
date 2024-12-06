
public class StringBufferClass {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		
		StringBuilder sb1  = new StringBuilder();
		
		// append 
		
		sb.append("Hello ");
		
		System.out.println(sb);
		
		// insert
		
		sb.insert(5,"Delhi");
		
		System.out.println(sb); // HDelhiello Hello Delhi
		
		// replace 
		
		sb.replace(1, 3, "ZZZ");
		
		System.out.println(sb);
		
		// delete 
		
		sb.delete(1, 3);
		
		System.out.println(sb);
		
		// reverse
		
		sb.reverse();
		
		System.out.println(sb);
		
		
		
		



	}

}
