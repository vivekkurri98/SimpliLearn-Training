package regex;

public class PANWithRegex {

	public static void main(String[] args) {

		String s="ABCDE7856K";
		if(s.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
			System.out.println("Valid PAN");
		}else {
			System.out.println("Invalid PAN");
		}
	}
}
