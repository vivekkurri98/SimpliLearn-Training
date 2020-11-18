package eg;

public class Palindrome {

	public static void main(String[] args) {
		String s = "madam";
		
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		String s2 = sb.toString();
		if(s.equals(s2)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Plaindrome");
		}
		
		int x=101;
		s=x+"";
		if(new StringBuffer(s).reverse().toString().equals(s)) {
			System.out.println("Palindrome Works");
		}else {
			System.out.println("Palindrome doesn't Works");
		}
	}

}
