package logical_snippets;
import java.util.Arrays;

public class Equality_Of_Arrays {

	public static void main(String[] args) {
		
		// first approach
		
		int a [] = {1,2,3,4,5};
		int b [] = {1,2,3,4,5};
		
		boolean result = Arrays.equals( a, b);
		
		if(result == true) 
		{
			System.out.println("Arrays are equal");
		}else {
			System.out.println("Arrays are not equal");
		}
		
		
		int c [] = new int [] {0,9,8,7,6};
		int d [] = new int [] {0,9,8,7,6};
		
		int length_Of_C = c.length;
		int length_Of_D = d.length;
		
		boolean status = true;
		
		if(length_Of_C == length_Of_D) 
		{
			for(int i = 0; i < length_Of_C; i++) 
			{
			  if(c[i] != d[i]) {
			  status = false;
			  }
			}
		}else 
		{
			status = false;
		}
		
		if(status == true) 
		{
			System.out.println("Arrays are equal");
		}else {
			System.out.println("Arrays are not equal");
		}

	}

}
