package logical_snippets;


public class Reverse_String {

	public static void main(String[] args) {
		
		
		String beforeReverse = "qwerty";
		//String afterReverse = "";
		
		// Using + concatenation 
		/*
		 * int len = beforeReverse.length(); for(int i = len - 1; i >= 0; i--) {
		 * afterReverse = afterReverse + beforeReverse.charAt(i);
		 * 
		 * } System.out.println(" String after reversed is : "+afterReverse);
		 */
		
		// Using character array method
		/*
		 * char a[] = beforeReverse.toCharArray(); int len = a.length;
		 * 
		 * for (int i = len - 1; i >= 0; i--) { afterReverse = afterReverse + a[i]; }
		 */
		
		StringBuffer sb = new StringBuffer(beforeReverse);
		StringBuffer reverse = sb.reverse();
		System.out.println(" String after reversed is : "+reverse);
	}

}
