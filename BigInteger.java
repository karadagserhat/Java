import java.util.Scanner;


public class BigInteger {



	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		java.math.BigInteger x=sc.nextBigInteger();
		java.math.BigInteger y = sc.nextBigInteger();
		
		
		System.out.println(x.add(y));
		System.out.println(x.multiply(y));
		
		sc.close();

	}

}
