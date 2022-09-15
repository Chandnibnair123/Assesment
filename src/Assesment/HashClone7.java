package Assesment;
import java.util.HashSet;

public class HashClone7
{

	public static void main(String[] args)
	{
		HashSet<String>h_set = new HashSet<String>();
		h_set.add("Red");
		h_set.add("Green");
		h_set.add("White");
		h_set.add("Pink");
		
		System.out.println("The hash set:" + h_set);
		HashSet<String>clonedSet = new HashSet<String>();
		clonedSet = (HashSet)h_set.clone();
		System.out.println("The new clone set elements:" +clonedSet);
		
		
	}
}
		
		
		