import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Exercise3b {
    public static void main(String[] args) {

//		ArrayIndexOutofBoundException

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
            int arr[] = new int[5];
            arr[5] = -1;
        }
        catch(ArrayIndexOutOfBoundsException e){
            logger.log(Level.SEVERE,"ArrayIndexOutofBoundException in Excercise2b was thrown",e);
        }
        finally {
            System.out.println("finally block");
        }
    }
}
