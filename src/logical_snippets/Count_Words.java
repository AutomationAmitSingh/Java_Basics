package logical_snippets;

import java.util.Scanner;

public class Count_Words {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a sentence: ");
		String real = sc.nextLine();
		
	    int count =1;
	    
	    for(int i = 0; i < real.length() - 1; i++ ) 
	    {
	     if((real.charAt(i)==' ')&&(real.charAt(i+1)!=' ')) 
	     {
	    	count++; 
	     }	
	    }
	    
	    System.out.println("The number of words are: "+count);

	}

}
