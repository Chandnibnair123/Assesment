package Assesment;
import java.util.Scanner;
public class Smallest {

	public static void main(String[] args) {
		int x,y,z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		x=sc.nextInt();
		System.out.println("Enter the second number");
		y=sc.nextInt();
		System.out.println("Enter the third number");
		z=sc.nextInt();
		if(x < y && x < z)
		{
			System.out.println("Smallest number is" +x);
		}
		else if(y < z)
		{
			System.out.println("Smallest number is" +y);
		}
		else
		{
			System.out.println("Smallest number is" +z);
		}
			
		
	}

}

	

	


