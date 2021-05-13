package logical_snippets;

import java.util.Scanner;

public class like_dislike_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int alice = sc.nextInt();
		int bob = sc.nextInt();
		int len = Integer.toString(alice).length();
		int arr [] = new int[len];
		int brr [] = new int[len];
		int j = 0;
		int count = 0;
		while(alice != 0 && bob !=0) 
		{
			arr [len-j-1] = alice % 10; 
			alice = alice/10; 
			brr [len-j-1] = bob % 10;
			bob = bob / 10;
			j++; 
		}
		for(int i = 0; i <= len - 1; i++) 
		{
			if(arr [i] == brr [i]) 
			{
			  count++;	
			}
		}
		
		System.out.println(count);

	}

}
