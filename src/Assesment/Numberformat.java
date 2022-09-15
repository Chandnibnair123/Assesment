package Assesment;
import java.util.Scanner;

public class Numberformat {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter any valid integer");
		try
		{
			number = Integer.parseInt(sc.next());
			System.out.println("you entered:" +number);
			break;
		}
		catch(NumberFormatException e) 
		{
			System.out.println("Number format exception occured");
		}
	}
}
}
		