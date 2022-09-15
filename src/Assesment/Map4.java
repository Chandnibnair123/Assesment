package Assesment;
import java.util.HashMap;
import java.util.Map;
public class Map4 {

	public static void main(String[] args) {
		HashMap<Integer,String> hash_map1 = new HashMap<Integer,String>();
		hash_map1.put(1, "Red");
		hash_map1.put(2, "Blue");
		hash_map1.put(3, "Grey");
		hash_map1.put(4, "Pink");
		hash_map1.put(5, "Yellow");
		System.out.println("Element of map1" +hash_map1);
		hash_map1.clear();
		System.out.println(" Now the element of map1" +hash_map1);
	}
}

		