package logical_snippets;

import java.util.Arrays;
import java.util.TreeSet;

public class Array_Duplicate_Remove_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer [] arr = {11, 5, 2, 23, 23, 5, 2, 11};
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		for(int i = 0; i < arr.length; i++) 
		{
			ts.add(arr[i]);
		}
		
		System.out.println(ts.toString());
		
		arr = new Integer[ts.size()];
		
		ts.toArray(arr);
		
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+"\t");
		}

	}

}
