import java.util.Scanner;

public class CountOccurranceWord {

	public static void main(String[] args) {
       System.out.println("Enter a String \n");
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       System.out.println("Enter the word");
       String word = sc.nextLine()
;   
       String a[] = str.split(" ");
     
      
       int count = 0;
       for (int i = 0; i < a.length; i++) 
       {
       
       if (word.equals(a[i]))
           count++;
       }
     
      System.out.println(count+ "in string");
   }
       
	}


