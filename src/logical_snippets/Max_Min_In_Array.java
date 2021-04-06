package logical_snippets;

public class Max_Min_In_Array {

	public static void main(String[] args) {
		
		int a [] = new int [] {34,76,54,23,98,21,15};
		
		int length = a.length;
		
		int max = a[0];
		int min = a[0];
		
		for(int i = 1; i < length; i++) 
		{
			if(a[i] > max) 
			{
				max = a[i];
			}else if(a[i] < min)
			{
				min = a[i];
			}
		}
		
		System.out.println("Maximum value is: "+max+" Minimum value is: "+min);

	}

}
