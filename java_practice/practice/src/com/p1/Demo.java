package com.p1;

public class Demo {

	public static void main(String[] args) {
		String s = "a2b3c4d2";
		char[] ch = s.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='0' && ch[i] <= '9') {
				for(int j=0; j<Character.getNumericValue(ch[i]); j++) {
					System.out.print(ch[i-1]);
				}
			}
		}
	}
}
