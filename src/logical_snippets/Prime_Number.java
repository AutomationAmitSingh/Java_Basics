package logical_snippets;
import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Please enter a number ");
		int number = sc.nextInt();
		int count = 0;
		
		if(number > 1) 
		{
			for (int i = 1; i <= number; i++) {
				
				if(number % i == 0) 
				{
					count++;
				}
				
			}
			if(count == 2) 
			{
				System.out.println(number+" is a prime number");
			}else 
			{
				System.out.println(number+" is not a prime number");
			}
			
		}else 
		{
			System.out.println(number+" is not a prime number ");
		}

	}

}
