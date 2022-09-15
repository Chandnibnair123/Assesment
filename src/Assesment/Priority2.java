package Assesment;
import java.util.PriorityQueue;

public class Priority2

{

	public static void main(String[] args)
	{
		PriorityQueue<String> pq1 = new PriorityQueue<String>();
		pq1.add("Yellow");
	    pq1.add("Green");
		pq1.add("Blue");
		pq1.add("Orange");
		pq1.add("White");
		System.out.println("Original priority queue" +pq1);
		pq1.offer("Purple");
		System.out.println("The priority queue" +pq1);
	}
}
		
		
	
		