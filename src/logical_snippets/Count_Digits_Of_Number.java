package logical_snippets;
import java.util.Scanner;

public class Count_Digits_Of_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int digit = sc.nextInt();
		int count = 0;
		
		while (digit > 0) {
			
			digit = digit/10;
			count++;
		}
		
		System.out.println(" It is a "+count+" digits number");

	}

}
