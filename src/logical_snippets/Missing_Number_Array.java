package logical_snippets;

public class Missing_Number_Array {

	public static void main(String[] args) {
		
		// Array should not have duplicates
		// Array no need to be sorted
		// Values should be in range
		
		int a [] = {1,2,3,4,5,6,7,9,10,11};
		int sum1 =0, sum2=0;
		
		for(int i=0; i < a.length; i++) 
		{
			sum1 = sum1 + a[i];
		}
		
		for(int i=1; i <= 11; i++) 
		{
			sum2 = sum2 + i;
		}
        
		System.out.println("Missing number in the array is: "+(sum2-sum1));
	}

}
