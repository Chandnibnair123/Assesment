package Assesment;
import java.util.HashMap;
public class Map6 {

	public static void main(String[] args) 
	{
		HashMap<Integer,String> hash_map1 = new HashMap<Integer,String>();
		hash_map1.put(1, "Red");
		hash_map1.put(2, "Blue");
		hash_map1.put(3, "Grey");
		hash_map1.put(4, "Pink");
		hash_map1.put(5, "Yellow");
		System.out.println("element of map1:" +hash_map1);
		HashMap<Integer,String> hash_map2 = new HashMap<Integer,String>();
		hash_map2=(HashMap)hash_map1.clone();
		System.out.println("Shallow copy of element of map1" +hash_map2);
		
	}
}