package logical_snippets;

import java.util.Scanner;

public class Reverse_Order_In_Sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a sentence: ");
		String real = sc.nextLine();
		String wordArray [] = real.split(" ");
		int len = wordArray.length;
		String reverse = "";
		for(int i = len-1; i >=0; i--) 
		{
			reverse = reverse + wordArray[i]+" ";
		}
		
		System.out.println(reverse);

	}

}
