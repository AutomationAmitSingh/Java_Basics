package logical_snippets;

import java.util.Arrays;
import java.util.Collections;

public class Built_In_Sort_Array {

	public static void main(String[] args) {
		
		int arr [] = {45,34,23,12,90,89,78,67,56};
		
		System.out.println("Array before sorting: "+Arrays.toString(arr));
		
		Arrays.parallelSort(arr);
		
		System.out.println("Array after sorting: "+Arrays.toString(arr));
		
        int arr1 [] = {45,34,23,12,90,89,78,67,56};
		
		System.out.println("Array before sorting: "+Arrays.toString(arr1));
		
		Arrays.sort(arr1);
		
		System.out.println("Array after sorting: "+Arrays.toString(arr1));
		
        Integer arr2 [] = {45,34,23,12,90,89,78,67,56};
		
		System.out.println("Array before sorting: "+Arrays.toString(arr2));
		
		Arrays.sort(arr2, Collections.reverseOrder());
		
		System.out.println("Array after sorting: "+Arrays.toString(arr1));
		
		
		
		

	}

}
