package logical_snippets;

import java.util.Scanner;

public class Like_Dislike_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String bob = sc.nextLine();
		String alice = sc.nextLine();
		char a [] = alice.toCharArray();
		char b [] = bob.toCharArray();
		int count = 0;
		for(int i=0; i <= a.length-1; i++) 
		{
		  if(a[i] == b[i]) 
		  {
			 count++; 
		  }
		}
		System.out.println(count);

	}

}
