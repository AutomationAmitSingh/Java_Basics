package logical_snippets;
import java.util.Scanner;

public class Count_Even_Odd_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num = sc.nextInt();
		int even_count = 0;
		int odd_count = 0;
		
		while (num > 0) {
			
			int rem = num % 10;
			
			if(rem % 2 == 0) 
			{
				even_count++;
			}else 
			{
				odd_count++;
			}
			
			num = num / 10;
		}
        
		System.out.println("Even number in the digits: "+even_count);
		System.out.println("Odd number in the digits: "+odd_count);
	}

}
