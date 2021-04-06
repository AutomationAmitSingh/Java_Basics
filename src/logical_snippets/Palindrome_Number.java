package logical_snippets;
import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Please enter the number -->");
		int original_number = sc.nextInt(), reverse_number = 0, number;
		number = original_number;
		
		while (number != 0) {
			
			reverse_number = reverse_number * 10 + number % 10;
			number = number / 10;
			
		}
		
		if(original_number == reverse_number) 
		{
			System.out.println(original_number+" is a palindrome number...!");
		}else 
		{
			System.out.println(original_number+" is not a palindrome number...!");
		}
		

	}

}
