package logical_snippets;

import java.util.Scanner;

public class Aphabet_Duplicate_Remove_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String ip_String = sc.nextLine();
		
		char[] ip_Char = ip_String.toCharArray();
		
		int count;
		
		for(int i = 0; i < ip_Char.length; i++) 
		{
			count = 1;
			for(int j = i + 1; j < ip_Char.length; j++) 
			{
				
				if(ip_Char[i] == ip_Char[j]) 
				{
					count++;
				}else 
				{
					continue;
				}
				
			}
			if(count > 1) 
			{
			  System.out.println(ip_Char[i]+" character repeated : "+count+" times");	
			}else 
			{
			  System.out.println(ip_Char[i]+" character not repeated");	
			}
		}

	}

}
