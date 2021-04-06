package logical_snippets;

import java.util.Scanner;

public class Reverse_Words {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a sentence to reverse: ");
		
		String real = sc.nextLine();
		
		String [] words = real.split(" ");
		
		String reverseString = "";
		String reverseBuilder = "";
		
		for(String a:words) 
		{
			StringBuilder sb = new StringBuilder(a);
			sb.reverse();
			String reverseWord = "";
			
			for(int i = a.length() - 1; i >=0; i--) {
				reverseWord = reverseWord + a.charAt(i);
			}
			reverseString = reverseString + reverseWord + " ";
			reverseBuilder = reverseBuilder + sb.toString() + " ";
			
		}
		
		
		
		System.out.println(reverseString);
		System.out.println(reverseBuilder);
		

	}

}
