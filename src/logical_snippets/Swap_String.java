package logical_snippets;

public class Swap_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// using third variable
		String city = "Pune";
		String country = "India";
		String sport = "Cricket";
		String movie = "Bigbull";
		String temp = "";
		temp = city;
		city = country;
		country = temp;
		System.out.println("city : "+city);
		System.out.println("country : "+country);
		
		// using without third variable
		sport = sport + movie;
		System.out.println("Concatenation ---> "+sport);
		movie = sport.substring(0, sport.length() - movie.length());
		System.out.println("Substring where start index included and end index excluded MOVIE ---> "+movie);
		sport = sport.substring(movie.length());
		System.out.println("Substring where start index included and end index excluded SPORT ---> "+sport);
		

	}

}
