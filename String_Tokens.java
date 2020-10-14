import java.util.Scanner;

public class String_Tokens {
	 public static void main(String[] args) 
	 {
	   Scanner scan = new Scanner(System.in);
	   String s=scan.nextLine();
	 //Complete the code
	     if (s.trim().length()==0 || s.trim().length()>400000)
	     {
	         System.out.println(0);
	         scan.close();
	         return;
	     }

	     String words[]=s.trim().split("[ !,?.\\_'@]+");
	     System.out.println(words.length);
	     for (String word:words)
	         System.out.println(word);
	     
	     scan.close();
	 }
}
