import java.util.Scanner;

public class Loops2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		for(int i=0; i<t; i++) {
			int a= sc.nextInt();
			int b= sc.nextInt();
			int n= sc.nextInt();
			//int c=a;
			for(int j=0; j<n; j++) {
				a+= Math.pow(2,j)*b;
				System.out.print(a+" ");
			}
			
			System.out.println();
		}
		sc.close();
	}
}
