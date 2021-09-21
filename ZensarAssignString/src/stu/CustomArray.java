package stu;
import java.util.Scanner;

public class CustomArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         Student[] arr = new Student[5];
         
         
         for (int i = 0; i<arr.length;i++)
         { 
        	 arr[i]= new Student();
        	 
        	 System.out.println("enter id, name, percent");
        	 arr[i].setSid(sc.nextInt());
        	 arr[i].setName(sc.nextInt());
        	 arr[i].setPercent(sc.nextInt());
         }
         
         for (int i = 0; i<arr.lenth;i++)
         {
        	 if(arr[i].getPercent()>75)
        		 System.out.println(arr[i].getName());
         }
	}

}
