package Assesment;
import java.util.HashMap;
import java.util.Map;


public class Map3 {

	public static void main(String[] args) {
		HashMap<Integer,String> hash_map1 = new HashMap<Integer,String>();
		hash_map1.put(1, "Red");
		hash_map1.put(2, "Blue");
		hash_map1.put(3, "Grey");
		hash_map1.put(4, "Pink");
		hash_map1.put(5, "Yellow");
		
		System.out.println("Element of map" +hash_map1);
		HashMap<Integer,String> hash_map2 = new HashMap<Integer,String>();
		hash_map2.put(1, "purple");
		hash_map2.put(2, "Meroon");
		hash_map2.put(3, "Violet");
		hash_map2.put(4, "Indigo");
		hash_map2.put(5, "Orange");
		
		System.out.println("Element of map" +hash_map2);
		hash_map2.putAll(hash_map1);
		
		System.out.println("Now the element of map2" +hash_map2);
	}
}