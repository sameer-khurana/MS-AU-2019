import java.io.File;
import java.io.IOException;

public class FileTxtExtension {
	
	public static void main(String[] args) {
		File dir = new File("C:\\Users\\sameer.khurana\\Downloads\\TempTxt");
		File listOfFiles[] = dir.listFiles();
		// Search .txt
		System.out.println("List of files:");
		for (int i = 0; i < listOfFiles.length; i++) {
		    String fileName = listOfFiles[i].getName();
		    System.out.println(fileName);
		    if (fileName.endsWith(".txt")) {
		        // and deletes
		    	try {
			        boolean success = (new File(listOfFiles[i].getCanonicalPath()).delete());
			        if(success) {
			        	System.out.println(fileName + " file deleted.");
			        }
		    	}
		    	catch(IOException e) {
		    		e.printStackTrace();
		    	}
		    }
		}
	}

}
