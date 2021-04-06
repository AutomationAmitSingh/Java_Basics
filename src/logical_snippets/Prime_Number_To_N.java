package logical_snippets;
import java.util.Scanner;

public class Prime_Number_To_N {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int count;
		
		for(int i = 2; i <= number; i++) 
		{
			count = 0;
			System.out.print(i+" ");
			
			for(int j = 1;j <= i; j++) 
			{
				if(i % j == 0) 
				{
					count++;
				}
			}
			
			if(count == 2) 
			{
				System.out.println(i+" is a prime number");
			}else 
			{
				System.out.println(i+" is not a prime number");
			}
			
		}

	}

}
