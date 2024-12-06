import java.io.FileOutputStream;
import java.io.IOException;

public class Filereading {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fout = new FileOutputStream("C://Users//Harsha Patil//Desktop//Testcases//test.txt");
		
		String s = "delhi";
		
		byte[] b = s.getBytes();
		
		fout.write(b);
		fout.close();
		
		


	}

}
