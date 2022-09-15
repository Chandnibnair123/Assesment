package Assesment;

public class Largestsmallest {

	public static void main(String[] args)
	{
		int number[] = new int[]
				{55,32,45,98,82,11,9,39,50};
		int smallest = number[0];
		int largest = number[0];
		for(int i=1;i<number.length;i++)
		{
			if(number[i]>largest)
				largest=number[i];
			else if(number[i] < smallest)
				smallest=number[i];
		}
		
		System.out.println("Largest number is:"+largest);
		System.out.println("Smallest number is:"+smallest);
	}
}
		

			
		