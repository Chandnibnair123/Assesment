package Assesment;
import java.util.HashMap;
public class Map8
{

	public static void main(String[] args)
	{
		HashMap<Integer,String> hash_map1 = new HashMap<Integer,String>();
		hash_map1.put(1, "Red");
		hash_map1.put(2, "Blue");
		hash_map1.put(3, "Grey");
		hash_map1.put(4, "Pink");
		System.out.println("Element of map1" +hash_map1);
		System.out.println("Does Hashmap contain value \'Red\':");
		if(hash_map1.containsValue("Red"))
			
		{
			System.out.println("Yes Value is present");
		}
			else
			{
				System.out.println("No Value is present");
			}
		}
}
		
		
				
		
	
		