package eg1;

public class Main {

	public static void main(String[] args) {

		System.out.println("Accessing MobileV2 features");
		MobileV2 v2 = new MobileV2();
		
		v2.calling();
		v2.message();
		v2.browsing();
		v2.gaming();
		System.out.println(v2.getClass());
		System.out.println(v2.hashCode());
		v2.displayMenu();
		
		System.out.println("\nAccessing MobileV1 features");
		MobileV1 v1 = new MobileV2();
		v1.calling();
		v1.message();
		System.out.println(v2.getClass());
		System.out.println(v2.hashCode());
		v1.displayMenu();

	}

}
