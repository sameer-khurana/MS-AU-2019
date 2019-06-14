import java.io.File;
import java.io.IOException;

public class ListFilesRecursively {
	
	static void listFilesRecursive(File dir) {
		
		try {
			if(dir.exists() && dir.isDirectory()) {
				File files[] = dir.listFiles();
				for(File f:files) {
					
					if(f.isFile()) {
						System.out.println("File: "+ f.getCanonicalPath());
					}
					else {
						System.out.println("Subdirectory: "+ f.getCanonicalPath());
						listFilesRecursive(f);
					}
				}
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		File dir = new File("C:\\Users\\sameer.khurana\\Downloads");
		listFilesRecursive(dir);
		
	}

}
