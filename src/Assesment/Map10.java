package Assesment;
import java.util.HashMap;
public class Map10 {

	public static void main(String[] args)
	{
		HashMap<Integer,String> hash_map1 = new HashMap<Integer,String>();
		hash_map1.put(1, "Red");
		hash_map1.put(2, "Blue");
		hash_map1.put(3, "Grey");
		hash_map1.put(4, "Pink");
		System.out.println("Element of map1" +hash_map1);
		String v=hash_map1.get(2);
		System.out.println("Value in the key 2 is" +v);
	}
}
		