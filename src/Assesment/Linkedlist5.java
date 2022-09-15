package Assesment;
import java.util.LinkedList;
import java.util.ListIterator;
public class Linkedlist5 {
	public static void main(String[] args) {
		LinkedList <String> link  = new LinkedList <String>();
		link.add("Chandni");
		link.add("Priya");
		link.add("Vasavi");
		link.add(1,"Pooja");
		ListIterator lt=link.listIterator();
		System.out.println("Elements are");
		while(lt.hasNext()) {
		System.out.println(lt.next()+"");
		}
	}
}
	
		
