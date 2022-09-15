package Assesment;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		int i;
		Scanner sc= new Scanner(System.in);
				
		System.out.println("Eligibility for voting");
		i=sc.nextInt();
		if(i>=18)
		{
			System.out.println("You are eligible to vote");
		}
			else {
				System.out.println("You are not eligibility to vote");
		}
	}

}
