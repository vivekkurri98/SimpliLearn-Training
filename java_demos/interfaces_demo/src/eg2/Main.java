package eg2;

public class Main {

	public static void main(String[] args) {

		System.out.println("Accessing Through Parent Interface through Child Interface ");
		Child c = new Implementor();
		c.parent1();
		c.child1();
		c.parent2();
		c.child2();
		c.parent3();
		
		System.out.println("\nAccessing through Parent Interface only Parent Interface");
		Parent p = new Implementor();
		p.parent1();
		p.parent2();
		p.parent3();

	}

}
