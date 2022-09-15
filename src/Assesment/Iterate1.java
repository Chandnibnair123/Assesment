package Assesment;
import java.util.LinkedList;
import java.util.ListIterator;


public class Iterate1 {

	public static void main(String[] args) 
	{
		LinkedList <String> countries = new LinkedList <String>();
		
	    countries.add("Canada");
		countries.add("UK");
		countries.add("INDIA");	
		
		ListIterator itr = countries.listIterator(2);
		System.out.println("Countries are");
		while (itr.hasNext())
		{
			System.out.print(itr.next()+"");
		}
	}
}
		
		