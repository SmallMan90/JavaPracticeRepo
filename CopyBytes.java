import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {

   public static void main(String[] args) throws IOException {
   
    FileInputStream in = null;
	FileOutputStream out = null;
	
	try {
	    in = new FileInputStream("xanadu.txt");
		out = new FileOutputStream("outagain.txt");
		int c;
		
		while((c = in.read()) != -1) {
		  System.out.println("The transferred byte is : " + c);
		  out.write(c);
		  }
		 } finally {
		   if (in != null) {
		       out.close();
			  }
			}
			
	}
}
		
		