package com.p1;

public class StringPractice {
/*
 * a2b3c4
 * aabbbcccc
 */
	
	public void stringFormatter(String s) {
		char[] chars = s.toCharArray();
		
		for (int i = 0; i < chars.length; i++) {
			if((chars[i]>=65 && chars[i]<=90) || (chars[i]>=97 && chars[i]<=122)){
				
			}
			else
				if(Character.getNumericValue(chars[i])>=1 && Character.getNumericValue(chars[i])<=9) {
					for (int j = 0; j < Character.getNumericValue(chars[i]); j++) {
						System.out.print(chars[i-1]);
					}
			}
		}
	}
	public static void main(String[] args) {
		StringPractice sp = new StringPractice();
		sp.stringFormatter("a9b1c2");
	}

}
