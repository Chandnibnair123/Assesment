package Assesment;
import java.util.TreeSet;
import java.util.Iterator;

public class Reversetreeset
{

	public static void main(String[] args)
	{
		TreeSet<String>tree_set = new TreeSet<String>();
		tree_set.add("White");
		tree_set.add("Blue");
		tree_set.add("Purple");
		System.out.println("Original tree set:" +tree_set);
		Iterator it= tree_set.descendingIterator();
		System.out.println("Element  in reverse order");
		while(it.hasNext())
			System.out.println(it.next());
	}
}

		
			