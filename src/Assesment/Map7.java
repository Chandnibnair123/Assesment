package Assesment;
import java.util.HashMap;
public class Map7 {

	public static void main(String[] args) {
		HashMap<Integer,String> hash_map1 = new HashMap<Integer,String>();
		hash_map1.put(1, "Red");
		hash_map1.put(2, "Blue");
		hash_map1.put(3, "Grey");
		hash_map1.put(4, "Pink");
		System.out.println("element of map1:" +hash_map1);
		System.out.println("Does hashmap contains key1?");
		if(hash_map1.containsKey(5))
		{
			System.out.println("Yes, key is present");
			
		}
		else
		{
			System.out.println("Yes, key is not present");
		}
	}
}
		