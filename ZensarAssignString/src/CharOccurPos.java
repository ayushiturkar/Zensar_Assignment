import java.util.Scanner;

public class CharOccurPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            System.out.println("Enter a string ");
           
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            System.out.println("Enter the character to fing in the given string");
            char ch = sc.nextLine().charAt(0);
            
           for(int i=0 ; i<str.length(); i++)
           {
        	   if(str.charAt(i)==ch)
        	   {
        		   System.out.println("The character occurrance of " ch+ "at");
        		   break;
        	   }
           }
            
	}

}
