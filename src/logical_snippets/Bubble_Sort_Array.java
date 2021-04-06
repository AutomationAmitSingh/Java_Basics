package logical_snippets;

import java.util.Arrays;

public class Bubble_Sort_Array {

	public static void main(String[] args) {
		
		int arr [] = {32,89,43,34,67,56};
		int len = arr.length;
		
		System.out.println("Array before bubble sorting: "+Arrays.toString(arr));
		
		for(int i = 0; i < len - 1; i++)  // Number of passes
		{
			for(int j = 0; j < len - 1; j++) // Number of iteration
			{
				if(arr[j] < arr[j+1]) 
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println("Array after bubble sorting: "+Arrays.toString(arr));

	}

}
