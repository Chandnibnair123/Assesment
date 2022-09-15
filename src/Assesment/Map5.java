package Assesment;
import java.util.HashMap;
public class Map5 
{

	public static void main(String[] args)
	{
		HashMap<Integer,String> hash_map1 = new HashMap<Integer,String>();
		hash_map1.put(1, "Red");
		hash_map1.put(2, "Blue");
		hash_map1.put(3, "Grey");
		hash_map1.put(4, "Pink");
		hash_map1.put(5, "Yellow");
		boolean result = hash_map1.isEmpty();
		System.out.println("element of map1:" +hash_map1);
		hash_map1.clear();
		result = hash_map1.isEmpty();
		System.out.println("element of map1:" +hash_map1);
		
	}
}
		