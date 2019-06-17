import java.util.Scanner;

public class Exercise1a {
	
	public static void main(String[] args) {
		
		// Performing division of numbers
		// Dividing by 0 produces Arithmetic Exception
		
		int num1, num2;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number:");
		num1 = input.nextInt();
		System.out.println("Enter second number: ");
		num2 = input.nextInt();
		
		int result = num1/num2;
		
		System.out.println(result);
		

		
		input.close();
		
	}

}
