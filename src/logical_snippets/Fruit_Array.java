package logical_snippets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Fruit_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fruit = "Pomogranate";
		char[] fruitArray = fruit.toCharArray();
		Set<Character> charSet = new HashSet<>();
		Set<Character> charSet1 = new HashSet<>();
		ArrayList<Character> charArr = new ArrayList<Character>();
		int count;
		for (char a : fruitArray) {

			count = 1;
			if (charSet.add(a) == true) {
				System.out.println(" Character not repeated: " + a);
			} else {
				System.out.println(" Character repeated: " + a);
				count++;
			}

			System.out.println("Character " + a + " repeated " + count + " times");
		}
		
		for(char b : fruitArray) 
		{
			charArr.add(b);
			if (charSet1.add(b) == true) {
				charSet1.add(b);
			} 
		}
		
		charArr.remove(charSet1);
		
		System.out.println(charArr.toString());
		System.out.println(charSet1.toString());

	}

}
