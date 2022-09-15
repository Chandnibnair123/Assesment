package Assesment;
import java.util.PriorityQueue;

public class Priority5 {

	public static void main(String[] args) {
		PriorityQueue<String> pq1 = new PriorityQueue<String>();
		pq1.add("Yellow");
	    pq1.add("Green");
		pq1.add("Blue");
		pq1.add("Orange");
		System.out.println(" Queue elements are" +pq1);
		System.out.println("First Queue element is:" +pq1.peek());
	}
}