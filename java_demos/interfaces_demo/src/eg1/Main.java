package eg1;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Accessing MyInterface Methods");
		MyInterface mi = new MyClass();
		mi.common();
		mi.myMethod1();
		mi.myMethod2();
		mi.myMethod3();
		mi.myMethod4();
		System.out.println(mi.hashCode());
		System.out.println(mi.getClass());

		System.out.println("\nAccessing MyInt2 Methods");
		MyInt2 i2 = new MyClass();
		i2.common();
		i2.myInt2Method1();
		i2.myInt2Method2();
		i2.myInt2Method3();
		System.out.println(i2.hashCode());
		System.out.println(i2.getClass());
		
		System.out.println("\nAccessing MyInterface.Inner Methods");
		MyInterface.Inner inner = new MyClass();
		inner.common();
		inner.inner1();
		inner.inner2();
		System.out.println(inner.hashCode());
		System.out.println(inner.getClass());
		
	}

}
