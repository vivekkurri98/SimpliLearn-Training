package eg1;

public class Demo {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int result = 0;
		
		try {
			result = a/b;
			String s=null;
			s.length();
		}catch(ArithmeticException e) {
			System.out.println("You cannot divide by zero"+e.getMessage());
		}catch(NullPointerException e) {
			System.out.println("Something is empty or null" );
		}
		
		finally {
			System.out.println("Result: "+result);
		}
		
		
		System.out.println("This is other lines of code of the application");

	}

}
