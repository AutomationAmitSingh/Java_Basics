package logical_snippets;
import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string : ");
		String original_string = sc.nextLine();
		String duplicate_string = original_string;
		String reverse = "";
		int len = duplicate_string.length();
		
		for(int i = len - 1; i >=0; i--) 
		{
			reverse = reverse + duplicate_string.charAt(i);
		}
        System.out.println("Reversed String is: "+reverse);
        
        if(original_string.equals(reverse)) 
        {
        	System.out.println(original_string+" is a palindrome string");
        }else 
        {
        	System.out.println(original_string+" is not a palindrome string");
        }
	}

}
