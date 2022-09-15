package Assesment;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlist7 
{

	public static void main(String[] args)
	{
		LinkedList <String> link  = new LinkedList <String>();
		
		link.add("mca");
		link.add("Nirmala college");
		System.out.println("Before adding" +link);
		link.addFirst("Chandni");
		System.out.println("After adding" +link);
	}
}
		