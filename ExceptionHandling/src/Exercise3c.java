import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Exercise3c {
    public static void main(String[] args) {

        FileInputStream fileInputStream =  null;

        Logger logger = Logger.getLogger("LearningLog");
        FileHandler fileHandler;


        try{
            fileHandler = new FileHandler("C:\\Users\\sameer.khurana\\Downloads\\TempTxt\\LogFile.log");
            logger.addHandler(fileHandler);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);

        }catch (IOException e){
            e.printStackTrace();
        }

        try {
            File file = new File("C:/Users/sameer.khurana/Downloads/Accolite Training/file.txt");
            fileInputStream = new FileInputStream(file);
            while(fileInputStream.read() != -1) {
                System.out.print( fileInputStream.read());
            }
        }
        catch(FileNotFoundException e) {
            logger.log(Level.SEVERE,"FileNotFoundException in Excercise3c was thrown",e);
        }
        catch(IOException e) {
            logger.log(Level.SEVERE,"IOException in Excercise3c was thrown",e);
        }
        finally {
            System.out.println("finally block");
            try {
                fileInputStream.close();
            }
            catch(IOException e) {
                logger.log(Level.SEVERE,"IOException in Excercise3c was thrown",e);
            }
            catch(NullPointerException e) {
                logger.log(Level.SEVERE,"NullPointerException in Excercise3c was thrown",e);
            }
        }

    }
}
