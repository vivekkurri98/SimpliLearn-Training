package mypack;

public class MyClass {

	public static void main(String vivek[]) {
		if(vivek!=null && vivek.length==2) {
		System.out.println("Hello World".toUpperCase());
		System.out.println(vivek[0]);
		System.out.println(vivek[1]);
//		MyClass m=new MyClass();
//		m.callPrivate();
		}else {
			System.out.println("Sorry can't recoginze");
		}
	}
	
//	public void callPrivate() {
//		A a=new A();
//		a.heyPrivate();
//	}
//	private class A{
//		public void heyPrivate() {
//			System.out.println("Hello Private");
//		}
//	}

}
