package regex;

public class EmailValidation {

	public static void main(String[] args) {
		
		String s="vivek.kurri98@gmail.com";
		
		if(s.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
			System.out.println("Valid Email");
		}else {
			System.out.println("Invalid Email");
		}

	}

}
