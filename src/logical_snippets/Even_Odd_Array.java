package logical_snippets;

public class Even_Odd_Array {

	public static void main(String[] args) {
		
		int [] a = new int[] {1,2,3,4,5,6,7,8,9,0};
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] % 2 == 0) 
			{
				System.out.println(" Even number : "+a[i]);
			}else 
			{
				System.out.println(" Odd number : "+a[i]);
			}
		}
	    
		for (int i : a) {
			if(i % 2 == 0) 
			{
				System.out.println(" Even number : "+i);
			}else 
			{
				System.out.println(" Odd number : "+i);
			}
		}

	}

}
