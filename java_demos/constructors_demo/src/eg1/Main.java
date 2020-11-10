package eg1;

public class Main {

	public static void main(String[] args) {
		
		Calculator c = new Calculator("Java");
		c.sayHello();
		
		Calculator c1 = new Calculator();
		
		Calculator c2 = new Calculator(200, 100);
		System.out.println(c2.add());
		System.out.println(c2.sub());
		System.out.println(c2.multiply());
		
		System.out.println(c.add());
		

	}

}
