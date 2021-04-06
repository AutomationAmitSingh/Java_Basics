package logical_snippets;

import java.util.Arrays;

public class Binary_Search_Array {

	public static void main(String[] args) {
		
		int arr [] = {12,23,34,45,56,78,89,90}; // Array should be shorted
		int key = 90;
		int first = 0;
		int last = arr.length-1;
		boolean flag = false;
		int mid;
		
		while(first <= last) 
		{
			mid = (first+last)/2;
			
			if(key == arr[mid]) 
			{
				System.out.println("Element Found...");
				flag = true;
				break;
			}else if (key > arr[mid]) 
			{
				first = mid + 1;
			}
			else 
			{
				last = mid - 1;
			}
		}
		
		if(flag == false) 
		{
		 System.out.println("Element not found...");	
		}
		
		int found = Arrays.binarySearch(arr, 91);
		System.out.println(found);

	}

}
