import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStream {

	public static void main(String[] args) throws IOException {


		FileInputStream fin = new FileInputStream("C:\\Users\\Harsha Patil\\Desktop\\"
				+ "Corporate Trainings\\Star Agile\\file.txt");
		
		int i =0;
		
		int cap = fin.available();
		
		System.out.println(cap);
		
		while((i=fin.read())!= -1) {
			
			System.out.print((char)i);
	}

	
		fin.close();
		
	}

}
