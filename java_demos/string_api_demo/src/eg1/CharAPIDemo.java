package eg1;

public class CharAPIDemo {
	
	public static void main(String[] args) {

	String s="ABCde()%#@%  12355K  9(70%^)";
	int alphaCount=0, upper=0, lower=0, digits=0, alphaNum=0, space = 0, special=0;
	for(int i=0; i<s.length(); i++) {
		char c=s.charAt(i);
		
		if(Character.isAlphabetic(c)) {
			alphaCount++;
			}
		if(Character.isUpperCase(c)) {
			upper++;
		}
		if(Character.isLowerCase(c)) {
			lower++;
		}
		if(Character.isDigit(c)) {
			digits++;
		}
		if(Character.isLetterOrDigit(c)) {
			alphaNum++;
		}
		if(Character.isWhitespace(c)) {
			space++;
		}
		if(!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
			special++;
		}
		}
	System.out.println("Total Alphabets: "+alphaCount);
	System.out.println("Total UpperCase: "+upper);
	System.out.println("Total LowerCase: "+lower);
	System.out.println("Total Digits: "+digits);
	System.out.println("Total AlphaNumberic: "+alphaNum);
	System.out.println("Total Spaces: "+space);
	System.out.println("Total Special Characters: "+special);
	}
}

