package logical_snippets;

public class power_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int base = 3, exponent = 4;
		
		double result = 1, verdict = 1, output = 1;
		
		result = Math.pow(base, exponent);
		
		System.out.println(result);
		
		while(exponent != 0) 
		{
			verdict *= base;
	        exponent--;
		}
		
		System.out.println(verdict);
		
		for(; exponent != 0; --exponent) 
		{
			output *= base;
		}
		
		System.out.println(output);

	}

}
