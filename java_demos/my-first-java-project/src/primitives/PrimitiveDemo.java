package primitives;

public class PrimitiveDemo {

	public static void main(String[] args) {
		
		int x = 777;
		System.out.println(x);
		
		float f = 9.99999f;
		System.out.println(f);
		
		double d = 12.11111111111;
		System.out.println(d);
		
		char c='h';
		x=c;
		System.out.println(x);
		x=200;
		c=(char)x;
		System.out.println(c);
		
		float m=x;
		System.out.println(m);
		m=22.22222222f;
		x=(int)m;
		System.out.println(x);
		
		long h=123;
		m=h;
		System.out.println(m);
	}

}
