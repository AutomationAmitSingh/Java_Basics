package logical_snippets;

public class Sum_Array {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9};
		int sum = 0;
		int total = 0;
		
		for (int i = 0; i < a.length; i++) {
			
			sum = sum + a[i];
		}
		System.out.println(" Total Sum is "+sum);
		
		for (int i : a) {
			
			total = total + i;
			
		}
		
		System.out.println(" Total Sum is "+total);

	}

}
