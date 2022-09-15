package Assesment;
import java.util.HashMap;
import java.util.Map;
public class Map2 {

	public static void main(String[] args) 
	{
		HashMap<Integer,String> hash_map = new HashMap<Integer,String>();
		hash_map.put(1, "Red");
		hash_map.put(2, "Blue");
		hash_map.put(3, "Grey");
		hash_map.put(4, "Pink");
		hash_map.put(5, "Yellow");
		System.out.println("Element of map" +hash_map);
		System.out.println("Size of element of map:" +hash_map.size() );
	}
}
		