package Assesment;
import java.util.Scanner;


public class Array2 {
	public static void main(String[] args) {
		int[] array = new int[10];
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 number");
		for(int i=0;i<10;i++)
		{
			array[i]=sc.nextInt();
			
		}
		System.out.println("Enter a number");
		a=sc.nextInt();
		for(int i=0;i<10;i++)
		{
			if(array[i]==a)
			{
				System.out.print("present");
				System.exit(0);
			}
			System.out.print("not present");
		}
	}
}


			
				
			
		
	


	