import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {

	public static void main(String[] args) throws IOException {

		FileOutputStream fout = new FileOutputStream("C:\\Users\\Harsha Patil\\Desktop\\"
				+ "Corporate Trainings\\Star Agile\\file2.txt");
		
		String s = "india";
		
		byte b[] = s.getBytes();
		
		fout.write(b);
		
		fout.close();


	}

}
