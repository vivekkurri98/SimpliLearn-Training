package eg1;

public class Calculator {
	
	int a, b;
	
	public Calculator(String s) {
		System.out.println("Hello "+s);
	}
	
	public void sayHello() {
		System.out.println("Hello from Method");
	};
	
	public Calculator() {
		System.out.println("Hello from non parameterized Constructor");
	}
	
	public Calculator(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	public int add() {
		return a+b;
	}
	
	public int sub() {
		return a-b;
	}
	
	public int multiply() {
		return a*b;
	}
}
