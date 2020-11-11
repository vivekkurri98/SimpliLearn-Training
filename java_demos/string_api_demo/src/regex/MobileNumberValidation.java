package regex;

public class MobileNumberValidation {

	public static void main(String[] args) {
		String s="+91-9833981882";
		
		if(s.matches("\\+91-[0-9]{10}")) {
			System.out.println("Valid Indian Mobile Number");
		}else {
			System.out.println("Invalid Indian Mobile Number");
		}

	}

}
