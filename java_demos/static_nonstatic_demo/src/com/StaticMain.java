package com;

public class StaticMain {

	public static void main(String[] args) {
		hey();
		StaticMain s = new StaticMain();
		s.hello();
		
		Demo.heyDemo();
		Demo d = new Demo();
		d.helloDemo();

	}
	
	public static void hey() {
		System.out.println("Hello, I'm Static");
	}
	
	public void hello() {
		System.out.println("Hello, I'm Non-Static");
	}

}
