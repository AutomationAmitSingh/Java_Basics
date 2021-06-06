package logical_snippets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class F_U_D_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Given a word in the form of string
		String city = "haphazard";
		
		// Function call for finding duplicate character
		count_Duplicate_Character(city);
		
		

	}

	private static void count_Duplicate_Character(String str) {
		// TODO Auto-generated method stub
		int count_U = 0, count_D = 0;
		char [] array_City = str.toCharArray();
		Map<Character, Integer> hm = new HashMap<Character, Integer>();
		ArrayList<Character> unique = new ArrayList<>();
		ArrayList<Character> duplicate = new ArrayList<>();
		String u = "", d = "";
		for(char c : array_City) 
		{
			
			if(hm.containsKey(c)) 
			{
				hm.put(c, hm.get(c)+1);
				count_D++;

			}else 
			{
				hm.put(c, 1);
				count_U++;
				
			}
		}
		
		for(Map.Entry<Character, Integer> entry : hm.entrySet()) 
		{
			if(entry.getValue() > 1) 
			{
				System.out.println("<---------------Duplicate Characters And Count------------------>");
				System.out.println(entry.getKey()+" : "+entry.getValue());
				duplicate.add(entry.getKey());
				d = d + entry.getKey();
				
			}else 
			{
				System.out.println("<---------------Unique Characters And Count------------------>");
				System.out.println(entry.getKey()+" : "+entry.getValue());
				unique.add(entry.getKey());
				u = u + entry.getKey();
			}
			
		}
		
		System.out.println(count_D+" : "+count_U);
		System.out.println(unique);
		System.out.println(duplicate);
		System.out.println(u);
		System.out.println(d);
		
		
	}

}
