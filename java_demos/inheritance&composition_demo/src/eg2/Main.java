package eg2;

public class Main {

	public static void main(String[] args) {
		
		Team t1 = new Team(2000, "India", "INDIA");
		Player p1 = new Player(100, "Vivek", 1, t1);
		//p1.printPlayer();
		printAnyObject(p1);
		Player p2 = new Player(101, "Sachin", 2, t1);
		//p2.printPlayer();	
		printAnyObject(p2);
		
		Person per = new Person(200, "Kunal");
		printAnyObject(per);
		
		Object o= new Object();
		printAnyObject(o);
		
		printAnyObject(t1);
	}
	
	public static void printAnyObject(Object obj) {
		if(obj instanceof Player) {
		Player p = (Player)obj;
		System.out.println("\nPrinting Player");
		p.printPlayer();
		}else if(obj instanceof Employee) {
			Employee e = (Employee)obj;
			System.out.println("Printing Employee");
			e.printEmployee();
		}else if(obj instanceof Person) {
			Person p = (Person)obj;
			System.out.println("\nPrinting Person");
			p.printPerson();
		}else if(obj instanceof Team) {
			Team t = (Team)obj;
			System.out.println("\nPrinting Team");
			t.printTeam();
		}else if(obj instanceof Organization) {
			Organization o = (Organization)obj;
			System.out.println("\nPrinting Organization");
			o.printOrganization();
		}else if(obj instanceof Address) {
			Address a = (Address)obj;
			System.out.println("\nPrinting Address");
			a.printAddress();
		}else {
			System.out.println("\nYou should java.lang.Object");
		}
	}

}
