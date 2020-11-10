package demo;

public class PlayerMain {

	public static void main(String[] args) {
		
		Player player = new Player();
		player.setId(200);
		player.setName("Kurri");
		player.printPlayer();
//		player.id = 100;
//		player.name="Vivek"; //loosely held
		//security concern
//		System.out.println(player.name); 
		
		Player p1 = new Player(100, "Vivek");
		p1.printPlayer();
		
		//modified
		p1.setId(20);
		p1.setName("Rahul");
		p1.printPlayer();
		
		System.out.println(p1.getId());
		System.out.println(p1.getName());
		
		

	}

}