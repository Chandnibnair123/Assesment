package Assesment;
import java.util.*;
import java.util.HashMap;

public class Map1 {

	public static void main(String[] args)
	{
		HashMap<Integer,String> hash_map = new HashMap<Integer,String>();
	hash_map.put(1, "Red");
	hash_map.put(2, "Blue");
	hash_map.put(3, "Grey");
	hash_map.put(4, "Pink");
	hash_map.put(5, "Yellow");
	for(Map.Entry x:hash_map.entrySet())
			{
		System.out.println(x.getKey()+""+ x.getValue());
			}
	}
}
			
	
	
		
