package com;

public class StaticMain {

	public static void main(String[] args) {
		hey();
		StaticMain s = new StaticMain();
		s.hello();
		
		Demo.heyDemo();
		Demo d = new Demo();
		d.helloDemo();
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Math.PI);
	}
	
	public static void hey() {
		System.out.println("Hello, I'm Static");
	}
	
	public void hello() {
		System.out.println("Hello, I'm Non-Static");
	}

}
