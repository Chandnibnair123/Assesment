package Assesment;
import java.util.Scanner;

public class Asci {

	public static void main(String[] args) {
		System.out.println("Enter a charachter");
		Scanner sc = new Scanner(System.in);
		char chr = sc.next().charAt(0);
		int asciiValue = chr;
		System.out.println("ASCII VALUE of "+chr+"is:"+asciiValue);
		
		

	}

}
