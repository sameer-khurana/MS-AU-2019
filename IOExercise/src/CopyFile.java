import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
	
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:\\Users\\sameer.khurana\\Downloads\\TempTxt\\ArjunReddy.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("C:\\Users\\sameer.khurana\\Downloads\\TempTxt\\KabirSingh.txt", true);
			String s = null;
 
			while ((s = br.readLine()) != null) { // read a line
				fw.write(s); // write to output file
				fw.flush();
			}
			br.close();
			fw.close();
                        System.out.println("file copied");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
