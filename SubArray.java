import java.util.Scanner;

public class SubArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int array[]= new int[n];
		
		for(int i=0; i<n; i++) {
			array[i]=sc.nextInt();}
		
		int count=0;
		
		for(int j=0; j<n; j++) {
			int sum=0;
			for(int k=j; k<n; k++) {
				sum+=array[k];
				if(sum<0) count++;
			}
		}
			
	
		System.out.println(count);
		sc.close();
}
}
