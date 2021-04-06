package logical_snippets;

public class Fabonacci_Series {

	public static void main(String[] args) {
		
		int first = 0;
		int second = 1;
		System.out.print(first+" "+second);
		
		for(int i = 2; i < 10; i++) 
		{
			int sum = first + second;
			first = second;
			second = sum;
			System.out.print(" "+sum);
		}

	}

}
