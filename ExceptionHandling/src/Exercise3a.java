import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Exercise3a {
    public static void main(String[] args) {

        // Performing division of numbers
        // Dividing by 0 produces Arithmetic Exception

//		private final static Logger LOGGER = Logger.getLogger(MyLogger.class.getName());


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
            System.out.println("catch block \nStack Trace:");
            ae.printStackTrace();
            Logger logger = Logger.getAnonymousLogger();
            logger.log(Level.SEVERE,"ArithmeticException in Excercise2a was thrown",ae);

        }

        finally {
            System.out.println("Finally block");
            input.close();

        }
    }
}
