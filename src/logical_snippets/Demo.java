package logical_snippets;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String company = "thiruvanantpuram";
		int count;
		int len = company.length();
		String unique = " ", duplicate = " ", pureUnique = "", temp = "";

		for (int i = 0; i < len; i++) {
			count = 1;

			for (int j = i + 1; j < len; j++) {
				if (company.charAt(i) == company.charAt(j)) {
					count++;
				}
			}

			System.out.println(company.charAt(i) + " " + count);

			if (count == 1) {
				unique = unique + unique.valueOf(company.charAt(i));
			} else {
				duplicate = duplicate + duplicate.valueOf(company.charAt(i));
			}

		}

		System.out.println(unique + " " + duplicate);
		
		for(int k = 0; k < unique.length(); k++) 
		{
			
			for (int l = 0; l < duplicate.length(); l++) 
			{
				if (unique.charAt(k) == duplicate.charAt(l)) 
				{
					String a = Character.toString(unique.charAt(k));
					temp = unique.replace(a, "");
				}
			}
			
			
			
		}
		pureUnique = pureUnique + temp;
		System.out.println(pureUnique);

	}

}
