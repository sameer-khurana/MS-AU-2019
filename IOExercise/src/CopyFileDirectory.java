import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class CopyFileDirectory {
	
	public static void main(String[] args) {
		
		String source = "C:\\Users\\sameer.khurana\\Downloads\\Accolite.txt";
		String dest = "C:\\Users\\sameer.khurana\\Downloads\\TempTxt\\Accolite.txt";
        
		InputStream is = null;
	    OutputStream os = null;
	    try {
	        is = new FileInputStream(source);
	        os = new FileOutputStream(dest);
	        byte[] buffer = new byte[1024];
	        int length;
	        while ((length = is.read(buffer)) > 0) {
	            os.write(buffer, 0, length);
	        }
	    } 
	    catch(FileNotFoundException e) {
        	e.printStackTrace();
        }
        catch(IOException e) {
        	e.printStackTrace();
        }
	    finally {
	    	try {
		        is.close();
		        os.close();
	    	}
	    	catch(IOException e) {
	    		e.printStackTrace();
	    	}
	    }
		
	}

}
