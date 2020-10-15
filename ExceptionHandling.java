import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			int x= sc.nextInt();
			int y= sc.nextInt();
			System.out.println(x/y);
		}
		catch(InputMismatchException|ArithmeticException e) {
			if(e instanceof InputMismatchException)
				System.out.println("java.util.InputMismatchException");
			else if(e instanceof ArithmeticException)
				System.out.println("java.lang.ArithmeticException: / by zero");
		}
		
		sc.close();
		
	}

}
