package override_objectclass;

public class PlayerMain {

	public static void main(String[] args) {
		
		Player p1 = new Player(100, "P1= Sachin");
		
		System.out.println(p1);
		System.out.println(p1.toString());
		
		Player p2 = new Player(200, "P2= Sourav");
		System.out.println(p2.toString());
		
		Player p3 = new Player(100, "P3= Sachin");
		System.out.println(p3.toString());
		
		if(p1.equals(p2)) {
			System.out.println("P1 & P2 are Same");
		}else {
			System.out.println("P1 & P2 are NOT Same");
		}
		
		if(p1.equals(p3)) {
			System.out.println("P1 & P3 are Same");
		}else {
			System.out.println("P1 & P3 are NOT Same");
		}

	}

}
