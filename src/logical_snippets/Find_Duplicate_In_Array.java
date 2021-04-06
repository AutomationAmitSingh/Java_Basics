package logical_snippets;
import java.util.HashSet;

public class Find_Duplicate_In_Array {

	public static void main(String[] args) {
		
		String a [] = {"Java","Amit","Singh","Amit","Singh"};
		
		int len = a.length;
		boolean flag = true;
		boolean stick = true;
		
		for(int i = 0; i < len; i++) 
		{
			for(int j = i+1; j < len; j++) 
			{
			  if(a[i] == a[j]) 
			  {
				System.out.println("Duplicate item: "+a[j]);  
				flag = false;  
			  }	
			}
		}
		
		if(flag == true) 
		{
			System.out.println("No duplicates founds");
		}else 
		{
			System.out.println("Duplicates founds");
		}
		
		HashSet<String> sample = new HashSet<String>();
		for(String b: a) 
		{
		  stick = sample.add(b);
		  System.out.println(stick);
		  if(stick == false) 
		  {
			  System.out.println("Duplicate item found: "+b);
		  }else {
			  System.out.println("Not a dublicate time: "+b);
		  }
		  
		}
		
		

	}

}
