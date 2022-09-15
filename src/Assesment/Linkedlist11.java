package Assesment;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlist11 {

	public static void main(String[] args) {
		LinkedList <String> link  = new LinkedList <String>();
		link.add("chandni");
		link.add("mca");
		link.add("Nirmala college");
		System.out.println("Elements are" +link);
		link.remove(1);
		System.out.println("After removing, elements are" +link);
	}
}

		