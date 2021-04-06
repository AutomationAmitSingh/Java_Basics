package logical_snippets;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class Generate_Random {

	public static void main(String[] args) {
		
		Random random = new Random();
		int number1 = random.nextInt(51);
		System.out.println(number1);
		double number2 = random.nextDouble();
		System.out.println(number2);
		
		double number3 = Math.random();
		System.out.println(number3);
		
		String number4 = RandomStringUtils.randomNumeric(5);
		System.out.println(number4);
		
		String number5 = RandomStringUtils.randomAlphabetic(5);
		System.out.println(number5);
		
		String number6 = RandomStringUtils.randomAlphanumeric(5);
		System.out.println(number6);

	}

}
