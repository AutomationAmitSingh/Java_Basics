package logical_snippets;

public class Linear_Search {

	public static void main(String[] args) {
		
		int arr [] = {10,20,30,40,50,60};
		
		int search_number = 70;
		boolean flag = false;
		int len = arr.length;
		
		for(int i = 0; i < len; i++) 
		{
			if(arr[i] == search_number) 
			{
				System.out.println("Number found at index: "+i);
				flag = true;
				break;
			}
		}
		
		if(flag == false) 
		{
		System.out.println("Number not found");	
		}

	}

}
