package logical_snippets;

import java.util.Arrays;

public class Checking_Favorites {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {4, 5, 3, 4, 2, 7};
		int len = arr.length;
		int [] rrg = new int [len];
		int [] rrl = new int [len];
		int [] rre = new int [len];
		int countl, countg, counte;
		int value;
		for(int i = 0; i <= len - 1; i++) 
		{
			countl = 0;
			countg = 0;
			counte = 0;
			for(int j = 0; j <= len - 1; j++) 
			{
				if(arr[i] < arr[j]) 
				{
					countl++;
				}else if(arr[i] > arr[j]) 
				{
					countg++;
				}else 
				{
					counte++;
				}
			}
			
			rrl[i] = countl;
			rrg[i] = countg;
			rre[i] = counte;
			
		}
		
		System.out.println(Arrays.toString(rrl));
		System.out.println(Arrays.toString(rrg));
		System.out.println(Arrays.toString(rre));

	}

}
