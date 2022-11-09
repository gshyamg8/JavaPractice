package JavaPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterfaceDemo {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("Myname", "Shyam");
		map.put("House", "Aasara");
		map.put("Company", "AlkaMasale");
		map.put("District", "Aurangabad");
		
		//Values after adding via HashMap
		System.out.println("Values after adding via HashMap : ");
		
		System.out.println(map);
		
		System.out.println();
		
		
		System.out.println("Values after printing via KeySet : ");
 		
		Set<String> keys = map.keySet();
		
		for(String k : keys) {
			System.out.println(k + " : " + map.get(k));
		}
	
		//HashTable is Synchronized and 
		//HashMap is not Synchronized
	}	
}
