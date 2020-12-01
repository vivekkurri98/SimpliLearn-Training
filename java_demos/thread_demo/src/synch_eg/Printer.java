package synch_eg;

public class Printer {
	
	public synchronized static void printMessages(Messages messages) {
		System.out.println(messages.getMessage1());
		try {
			Thread.sleep(1200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(" "+messages.getMessage2());
	}
	
	public static void sayHello() {
		System.out.println("Hello from "+Thread.currentThread().getId()+" this is not synchronized");
	}

}
