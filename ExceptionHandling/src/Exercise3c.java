import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Exercise3c {
    public static void main(String[] args) {

        FileInputStream fileInputStream =  null;

        try {
            File file = new File("C:/Users/sameer.khurana/Downloads/Accolite Training/file.txt");
            fileInputStream = new FileInputStream(file);
            while(fileInputStream.read() != -1) {
                System.out.print( fileInputStream.read());
            }
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
            Logger logger = Logger.getAnonymousLogger();
            logger.log(Level.SEVERE,"FileNotFoundException in Excercise2c was thrown",e);
        }
        catch(IOException e) {
            e.printStackTrace();
            Logger logger = Logger.getAnonymousLogger();
            logger.log(Level.SEVERE,"IOException in Excercise2c was thrown",e);
        }
        finally {
            System.out.println("finally block");
            try {
                fileInputStream.close();
            }
            catch(IOException e) {
                e.printStackTrace();
            }
            catch(NullPointerException e) {
                e.printStackTrace();
            }
        }

    }
}
