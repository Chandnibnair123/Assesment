package Assesment;
import java.util.LinkedList;
import java.util.ListIterator;


public class Linkedlist8 {

	public static void main(String[] args)
	{
LinkedList <String> link  = new LinkedList <String>();
		
		link.add("mca");
		link.add("Nirmala college");
		System.out.println("Before changes" +link);
		link.addLast("Chandni");
		LinkedList <String> newlink  = new LinkedList <String>();
		newlink.add("Computer Science");
		newlink.add("mg university");
		
		link.addAll(1,newlink);
		System.out.println("After changes" +link);
		}
}
		
	
		
		

	
