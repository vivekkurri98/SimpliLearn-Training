package eg;

public class Calculator {
	
	public void add(int a, int b) {
		System.out.println("(int,int) is called, the result is: "+(a+b));
	}
	
	public void add(long a, long b) {
		System.out.println("(long,long) is called, the result is: "+(a+b));
	}
	
	public int add(int x, int y, int z) {
		System.out.print("(int, int, int) is called, the result is: ");
		return x+y+z;
	}
	
	public float add(float a, int b) {
		System.out.print("(float, int) is called, the result is: ");
		return a+b;
	}
	
	public float add(float a, float b) {
		System.out.print("(float, float) is called, the result is: ");
		return a+b;
	}
}
