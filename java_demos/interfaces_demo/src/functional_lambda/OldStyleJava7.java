package functional_lambda;

public class OldStyleJava7 implements Hello {
	
	public static void main(String[] args) {
		
		Hello h = new OldStyleJava7();
		h.sayHello();
		
		Hello h1 = new OldStyleJava71();
		h1.sayHello();
		
		Hello a = new Hello() {
			
			@Override
			public void sayHello() {
				System.out.println("Hello Anonymous1");		
			}
		};
		a.sayHello();
		
		Hello a1 = new Hello() {
			
			@Override
			public void sayHello() {
				System.out.println("Hello Anonymous2");	
			}
		};
		a1.sayHello();
		
	}

	@Override
	public void sayHello() {
		System.out.println("Hello Hello");
		
	}

}
