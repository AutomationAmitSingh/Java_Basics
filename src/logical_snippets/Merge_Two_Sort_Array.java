package logical_snippets;

public class Merge_Two_Sort_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr1 = {1, 4, 4, 7};
		int [] arr2 = {2, 4, 6, 8};
		int arr1_len = arr1.length;
		int arr2_len = arr2.length;
		int arr3 [] = new int [arr1_len+arr2_len];
		merge_Arrays(arr1, arr2, arr1_len, arr2_len, arr3);
		System.out.println(" Arrays after merging: ");
		for(int i = 0; i < arr1_len+arr2_len; i++) 
		{
		 System.out.print(arr3[i]+" ");	
		}

	}

	private static void merge_Arrays(int[] arr1, int[] arr2, int arr1_len, int arr2_len, int[] arr3) {
		// TODO Auto-generated method stub
		
		int i = 0, j = 0, k = 0;
		
		while(i < arr1_len && j < arr2_len) 
		{
			if(arr1[i] < arr2[j]) 
			{
			  arr3[k++] = arr1[i++];	
			}else 
			{
				arr3[k++] = arr2[j++];
			}
		}
		
		while(i < arr1_len) 
		{
			arr3[k++] = arr1[i++];
		}
		
		while(j < arr2_len) 
		{
			arr3[k++] = arr2[j++];
		}
		
	}

}
