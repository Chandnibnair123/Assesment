package Assesment;
import java.util.HashMap;
import java.util.Set;
public class Map9 {

	public static void main(String[] args) {
		HashMap<Integer,String> hash_map1 = new HashMap<Integer,String>();
		hash_map1.put(1, "Red");
		hash_map1.put(2, "Blue");
		hash_map1.put(3, "Grey");
		hash_map1.put(4, "Pink");
		System.out.println("Element of map1" +hash_map1);
		Set set=hash_map1.entrySet();
		System.out.println("Set view" +set);
	}
}