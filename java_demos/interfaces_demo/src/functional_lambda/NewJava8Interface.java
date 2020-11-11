package functional_lambda;

public interface NewJava8Interface {

	default void iAmDefault() {
		System.out.println("This is default implementation of method");
		System.out.println("from the Java 8 and above");
	}
	
	public static void iAmStatic() {
		System.out.println("Hello static in interfrace from Java 8");
	}
	
	void hello();
}
