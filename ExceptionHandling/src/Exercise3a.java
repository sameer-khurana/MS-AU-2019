import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Exercise3a {
    public static void main(String[] args) {

        // Performing division of numbers
        // Dividing by 0 produces Arithmetic Exception

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

        int num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        num1 = input.nextInt();
        System.out.println("Enter second number: ");
        num2 = input.nextInt();

        try {

            int result = num1/num2;

            System.out.println(result);
        }

        catch(ArithmeticException ae) {
            logger.log(Level.SEVERE,"IOException in Excercise2c was thrown",ae);
        }

        finally {
            System.out.println("Finally block");
            input.close();

        }
    }
}
