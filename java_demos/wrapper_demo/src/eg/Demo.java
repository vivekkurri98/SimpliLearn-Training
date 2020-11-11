package eg;

public class Demo {

	public static void main(String[] args) {
		
		int x = 10;
		Integer i=x;
		System.out.println(x);
		System.out.println(i);
		i=9;
		x=i;
		System.out.println(x);
		
		Integer i1=5;
		Integer i2=5;
		Integer i3=new Integer(5);
		
		System.out.println(i1==i2);
		System.out.println(i1==i3);

		System.out.println(i1.equals(i2));
		System.out.println(i1.equals(i3));
		
		System.out.println(i1.compareTo(10));
		System.out.println(i1.compareTo(4));
		System.out.println(i1.compareTo(5));
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.toBinaryString(33));
		System.out.println(Integer.toOctalString(44));
		
		String s="123";
		int x1=Integer.parseInt(s);  //Wrapper.parseInt(Object obj) apart from Character Class
		System.out.println(x1);
		
		x1=1000;
		s=x1+"";
		System.out.println(s);
		
		Integer i7=9999;
		s=i7.toString();
		System.out.println(s);
		
		Float f=i7.floatValue();
		System.out.println(f);
		f = 99.99997f;
		i7=f.intValue();
		System.out.println(i7);
		
		Double d=i7.doubleValue();
		System.out.println(d);
		
		Long l=i7.longValue();
		System.out.println(l);
	}

}
