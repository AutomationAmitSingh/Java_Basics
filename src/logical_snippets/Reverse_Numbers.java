package logical_snippets;
import java.util.Scanner;

public class Reverse_Numbers {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter a number to reverse: ");
		int number = sc.nextInt();
		
		// First method using algorithm
		//int reverse = 0;
		
		/*
		 * while (number != 0) {
		 * 
		 * reverse = reverse * 10 + number % 10; number = number / 10;
		 * 
		 * }
		 */
		
		// Second method using string buffer
		
		/*
		 * StringBuffer sb = new StringBuffer(String.valueOf(number)); StringBuffer
		 * reverse = sb.reverse(); System.out.println(" Reversed number is: "+reverse);
		 */
		
		StringBuilder stbl = new StringBuilder();
		stbl.append(number);
		StringBuilder reverse = stbl.reverse();
		System.out.println(" Reversed number is: "+reverse);

	}

}
