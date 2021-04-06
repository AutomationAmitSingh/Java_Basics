package logical_snippets;
import java.util.Scanner;

public class Largest_Of_Three_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int first = sc.nextInt();
		
		System.out.println("Enter second number: ");
		int second = sc.nextInt();
		
		System.out.println("Enter third number: ");
		int third = sc.nextInt();
		
		// first logic
		if(first > second && first > third) 
		{
			System.out.println(first+" is the largest number (first logic)");
		}else if (second > first && second > third) {
			
			System.out.println(second+" is the largest number (first logic)");
		}else 
		{
			System.out.println(third+" is the largest number (first logic)");
		}
		
		// second logic
		int largest1 = first > second ? first : second;
		int largest2 = largest1 > third ? largest1 : third;
		
		System.out.println(largest2+" is the largest number");
		
		// single line
		int largest = (first > second ? first : second) > third ? (first > second ? first : second) : third;
		
		System.out.println(largest+" is the largest number");

	}

}
