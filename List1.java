import java.util.LinkedList;
import java.util.Scanner;

public class List1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		LinkedList<Integer> list= new LinkedList<>();
		for(int i=0; i<n; i++) {
			int x= sc.nextInt();
			list.add(x);
			
		}
		
		int q= sc.nextInt();
		for(int i=0; i<q; i++) {
			String action= sc.next();
			if(action.equals("Insert")) {
				int index= sc.nextInt();
				int value= sc.nextInt();
				list.add(index, value);
			}
			else
			{
				int index= sc.nextInt();
				list.remove(index);
			}
		}
	
		sc.close();
		
		for(int i : list) {
			System.out.println(i+" ");
		}
}
}
