package logical_snippets;

public class Swap_Numbers {

	public static void main(String[] args) {

		// First logic using third variable
		int a = 15, b = 25, temp;
		System.out.println(" Before swapping values are for a: " + a + " and for b: " + b);
		temp = a;
		a = b;
		b = temp;
		System.out.println(" After swapping values are for a: " + a + " and for b: " + b);

		// Second logic without using third variable and with + and -
		int c = 24, d = 29;
		System.out.println(" Before swapping values are for c: " + c + " and for d: " + d);
		c = c + d;
		d = c - d;
		c = c - d;
		System.out.println(" After swapping values are for c: " + c + " and for d: " + d);

		// Third logic without using third variable and with * and / but values should
		// not be zero
		int e = 43, f = 34;
		System.out.println(" Before swapping values are for e: " + e + " and for f: " + f);
		e = e * f;
		f = e / f;
		e = e / f;
		System.out.println(" After swapping values are for e: " + e + " and for f: " + f);

		// Fourth logic without using third variable and with using bit wise XOR (^)
		int g = 52, h = 26;
		System.out.println(" Before swapping values are for g: " + g + " and for h: " + h);
		g = g ^ h;
		h = g ^ h;
		g = g ^ h;
		System.out.println(" After swapping values are for g: " + g + " and for h: " + h);
		
		// Fifth logic is with single statement
		int m = 12, n = 21;
		System.out.println(" Before swapping values are for m: " + m + " and for n: " + n);
		n = m + n - (m = n);
		System.out.println(" After swapping values are for m: " + m + " and for n: " + n);

	}

}
