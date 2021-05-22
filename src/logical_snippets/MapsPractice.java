package logical_snippets;
import java.util.*;
import java.util.Map.Entry;

public class MapsPractice {

	public static void main(String[] args) {
		// Initialization of map using Generic
		Map<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("A", new Integer(100));
		hm.put("B", new Integer(200));
		hm.put("C", new Integer(300));
		hm.put("D", new Integer(400));
		
		// Traversing through the Map
		for(Entry<String, Integer> me : hm.entrySet()) 
		{
			System.out.print(me.getKey()+" : ");
			System.out.println(me.getValue());
		}
		
		// Default initialization of a Map
		Map<Integer, String> hm1 = new HashMap<>();
		hm1.put(1, "Selenium");
		hm1.put(new Integer(2), "Cypress");
		hm1.put(3, "Behave");
		
		System.out.println(hm1);
		
		// Updated the value of map
		hm1.put(new Integer(1),"Cucumber");
		
		System.out.println(hm1);
		
		// Remove one element from the map
		hm.remove("C");
		System.out.println(hm);
		
		// Iterating through the map
		for(Map.Entry<Integer, String> me : hm1.entrySet()) 
		{
			int key = (int)me.getKey();
			String value = (String)me.getValue();
			
			System.out.println(key+" : "+value);
			
		}

	}

}
