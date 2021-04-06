package logical_snippets;
import java.util.Scanner;

public class Factorial_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number : ");
		int number = sc.nextInt();
		long asending = 1;
		long desending = 1;
		
		for(int i = 1; i <= number; i++) 
		{
			asending = asending * i;
		}
		
		System.out.println("Asending factorial: "+asending);
		
		for(int i = number; i >= 1; i--) 
		{
			desending = desending * i;
		}
		
		System.out.println("Desending factorial: "+desending);
		

	}

}
