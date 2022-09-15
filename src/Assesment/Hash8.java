package Assesment;
import java.util.*;

public class Hash8
{

	public static void main(String[] args)
	{
		HashSet<String>h_set1 = new HashSet<String>();
		h_set1.add("Red");
		h_set1.add("Green");
		h_set1.add("White");
		h_set1.add("Pink");
		System.out.println("First Hash Set Content: " +h_set1);
		
		HashSet<String>h_set2 = new HashSet<String>();
		h_set2.add("Orange");
		h_set2.add("White");
		h_set2.add("Violet");
		h_set2.add("Yellow");
		System.out.println("Second Hash Set Content: " +h_set2);
		h_set1.retainAll(h_set2);
		System.out.println("Hashset contents:" + h_set1);
		
		}
		
		
	}
		