import java.util.Scanner;

public class Substring_comparisons {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s= sc.next();
		int x = sc.nextInt();
		
		String min= s.substring(0, x);
		String max= s.substring(0, x);
		
		for(int i=0; i<=s.length()-x; i++) {
			if(s.substring(i, i+x).compareTo(min)<0) 
				min= s.substring(i, i+x);
			if(s.substring(i, i+x).compareTo(max)>0)
				max=s.substring(i, i+x);
			
		}
		System.out.println(min+ "\n"+ max);
		sc.close();
	}
	}