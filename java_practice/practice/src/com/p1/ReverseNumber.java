package com.p1;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 54321;
		int rev= 0;
		
		while(num !=0) {
			int digit = num%10;
			rev = rev*10+digit;
			num = num/10;
		}
		System.out.println(rev);
	}

}
