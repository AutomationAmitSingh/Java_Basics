package logical_snippets;
import java.util.Scanner;

public class Sum_Of_Digits_In_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number = sc.nextInt();
		int sum = 0;
		
		while (number > 0) {
			
			sum = sum + number % 10;
			number = number / 10;
		}
        System.out.println("Sum of the digits in the number is : "+sum);
	}

}
