package Assesment;
import java.util.PriorityQueue;


public class Priority4
{

	public static void main(String[] args) 
	{
		
		PriorityQueue<String> pq1 = new PriorityQueue<String>();
		
		pq1.add("Yellow");
	    pq1.add("Green");
		pq1.add("Blue");
		pq1.add("Orange");
		System.out.println("First Queue elements are" +pq1);

		PriorityQueue<String> pq2 = new PriorityQueue<String>();
		pq1.add("Red");
	    pq1.add("Grey");
		pq1.add("Indigo");
		pq1.add("Blue");
		System.out.println("Second Queue elements are" +pq2);
		pq1.retainAll(pq2);
		System.out.println("Queue content:" +pq1);
	}
}
		
		