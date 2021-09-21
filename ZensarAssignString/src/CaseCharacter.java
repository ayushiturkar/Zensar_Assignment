import java.util.Scanner;

public class CaseCharacter {

	public static void main(String[] args) {
		int c;
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		str=sc.nextLine();
		
		
		
		for( c=0;c<str.length();c++)
			{
			    int ch = str.charAt(c);
				if(ch >= 64 && ch<=99)
					{
						ch=ch+32;
						System.out.print((char) ch);
					}
				else if(ch >= 96 && ch<=123)
				{
					ch=ch-32;
					System.out.print((char) ch);
				}
				if(ch==32)
					System.out.print(" ");
			}
		
		
	}

}
