package functional_lambda;

public class Java8LambdaStyle {

	public static void main(String[] args) {
		
		Hello h=()->{
			System.out.println("Hello lambda");
		};
		h.sayHello();
		
		Hello h1=()-> {
			System.out.println("Hello Lambda Again");
		};
		h1.sayHello();
		
		HelloAgain ha=(s)->{
			System.out.println("Hello "+s);
		};
		ha.sayHello("Vivek");
		
		Addition add=(x,y,z)->{
			return x+y+z;
		};
		System.out.println(add.sum(100, 200, 300));
	}

}
