import java.util.Scanner;

public class CheakIfNoPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a element in array\n"); 
        int array[] = new int[10];
        for(int i=0; i<array.length; i++)  
        {    
         array[i]=sc.nextInt();  
        }  
        System.out.println("Array elements are: ");    
        for (int i=0; i<array.length; i++)   
        {  
        System.out.println(array[i]);  
        }  
        
        for (int i=0; i<array.length; i++)
        {
        	
        }
         
	}

}
