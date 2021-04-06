package logical_snippets;

public class Count_char_String {

	public static void main(String[] args) {
		
		String sample1 = "Amit Singh Test Engineer";
		
		int len = sample1.length();
		System.out.println(len);
		char key = 't';
		int count = 0;
		
		for(int i = 0; i < len; i++) 
		{
			if(sample1.charAt(i) == key) 
			{
				count++;
			}
		}
		
		System.out.println(" The number of character for key "+key+" is "+count);
		
		int len1 = sample1.replace("t", "").length();
		
		System.out.println(len1);
		
		System.out.println("Count of occurence is: "+(len-len1));

	}

}
