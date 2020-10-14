import java.util.Scanner;

public class Primality_Test {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//String s= sc.nextLine();
		System.out.println(sc.nextBigInteger().isProbablePrime(100) ? "prime" : "not prime");
		sc.close();
	}

}
