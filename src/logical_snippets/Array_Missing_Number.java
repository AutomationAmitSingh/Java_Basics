package logical_snippets;

public class Array_Missing_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* XOR
		 * 1 1 = 0
		 * 1 0 = 1
		 * 0 1 = 1
		 * 0 0 = 0
		 * */
		
		// Array should start from 1 and should not miss more than one number. Sorted Not Sorted Do not matter
		
		int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12,14,15,16};
		int arrayLength = arr.length;
		findMissingNumber(arr, arrayLength);
		findMissingNumberUsingXor(arr, arrayLength);

	}

	private static void findMissingNumberUsingXor(int[] arr, int al) {
		// TODO Auto-generated method stub
		int x1 = arr[0];
		for(int i = 1; i < al; i++) 
		{
			x1 = x1 ^ arr[i];
		}
		
		int expectedLength = al + 1;
		
		int x2 = 1;
		
		for(int i = 2; i <= expectedLength; i++) 
		{
			x2 = x2 ^ i;
		}
		
		System.out.println(" Missing number is : "+(x1 ^ x2));
		
	}

	private static void findMissingNumber(int [] a, int al) {
		// TODO Auto-generated method stub
		
		int expectedLength = al + 1;
		int totalSum = (expectedLength * (expectedLength + 1))/2;
		int sum = 0;
		
		for(int i = 0; i < al; i++) 
		{
		   sum = sum + a[i];	
		}
		
		System.out.println(" Missing number is : "+(totalSum - sum));
		
	}

}
