package logical_snippets;

import java.util.Arrays;
import java.util.Scanner;

public class Segregate_Zero_NonZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Following Java program pushes all the zeros in an array to its end.
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the size of the array : ");
		int array_Size = sc.nextInt();
		int zero_Non_Zero_Array [] = new int [array_Size];
		System.out.println(" Enter the number in any array : ");
		for(int i = 0; i < array_Size; i++) 
		{
			zero_Non_Zero_Array[i] = sc.nextInt();
		}
		
		System.out.println(" Array created is : "+Arrays.toString(zero_Non_Zero_Array));
		System.out.println(" Resultant array is : ");
		
		int pos = 0;
		
		for(int i = 0; i < zero_Non_Zero_Array.length; i++) 
		{
			if(zero_Non_Zero_Array[i] != 0) 
			{
			 zero_Non_Zero_Array[pos] = zero_Non_Zero_Array[i];
			 pos++;
			}
		}
		
		
		while(pos < zero_Non_Zero_Array.length) 
		{
			zero_Non_Zero_Array[pos] = 0;
			pos++;
		}
		
		System.out.println(" Array created is : "+Arrays.toString(zero_Non_Zero_Array));
		
		//Following Java program pushes all the zeros in an array to the start
		
		int non_Zero_Zero_Array [] = new int [array_Size];
		System.out.println(" Enter the number in any array : ");
		for(int i = 0; i < array_Size; i++) 
		{
			non_Zero_Zero_Array[i] = sc.nextInt();
		}
		
		System.out.println(" Array created is : "+Arrays.toString(non_Zero_Zero_Array));
		System.out.println(" Resultant array is : ");
		
		int index = non_Zero_Zero_Array.length - 1;
		
		for (int i = non_Zero_Zero_Array.length -1; i >=0; i--) 
		{
			if(non_Zero_Zero_Array[i] != 0) 
			{
				non_Zero_Zero_Array[index] = non_Zero_Zero_Array[i];
				index--;
			}
		}
		
		while(index >= 0) 
		{
			non_Zero_Zero_Array[index] = 0;
		  index--;
		}
		
		System.out.println(" Array created is : "+Arrays.toString(non_Zero_Zero_Array));

	}

}
