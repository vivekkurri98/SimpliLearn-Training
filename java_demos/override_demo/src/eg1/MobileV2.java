package eg1;

public class MobileV2 extends MobileV1 {
	
	public void gaming() {
		System.out.println("Gaming feature of V2");
	}
	
	public void browsing() {
		System.out.println("Browsing feature of V2");
	}
	
	public void socialApp() {
		System.out.println("Social App feature of V2");
	}
	
	@Override
	public void displayMenu() {
		System.out.println("Menu in V2 is updated and displayed as GRID View");
	}
	

}
