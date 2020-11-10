package eg;

public class CalciMain {

	public static void main(String[] args) {

		Calculator c = new Calculator();
		
		c.add(10, 22);
		
		c.add(6660L, 2222222L);
		
		System.out.println(c.add(10, 20, 30));
		
		System.out.println(c.add(12.5f, 13));
		
		System.out.println(c.add(12.5f, 13.2f));

	}

}
