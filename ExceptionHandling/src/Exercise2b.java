import java.util.logging.Level;
import java.util.logging.Logger;

public class Exercise2b {
	
public static void main(String[] args) {
		
//		ArrayIndexOutofBoundException
		
		try {
			int arr[] = new int[5];
			arr[5] = -1;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("catch block");
			e.printStackTrace();
			Logger logger = Logger.getAnonymousLogger();
			logger.log(Level.SEVERE,"ArrayIndexOutofBoundException in Excercise2b was thrown",e);
		}
		finally {
			System.out.println("finally block");
		}
	}

}
