package logical_snippets;

public class Remove_Junk_Array {

	public static void main(String[] args) {
		
		String junk = "!@#$%^&*()Amit)(*&^%$#@!Singh#$%123";
		System.out.println(junk);
		String noJunk = junk.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(noJunk);
		
		String space = "    Selenium     Automation     Testing   ";
		System.out.println(space);
		String noSpace = space.replaceAll("\\s", "");
		System.out.println(noSpace);
		
		String str = "Welcome to eclipse";
		String str1 = str.replaceFirst("(.*)to(.*)", "To");
		System.out.println(str1);
		String str2 = str.replaceFirst("to", "To");
		System.out.println(str2);
		

	}

}
