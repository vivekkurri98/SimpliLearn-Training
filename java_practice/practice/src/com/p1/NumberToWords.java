package com.p1;

import java.util.Scanner;

public class NumberToWords {
	
	public void toWords(char[] ch) {
		
			for(int i=0; i<ch.length; i++) {
			
			switch(ch[i]) {
			case '1': 
				System.out.print("one");
				break;
			case '2':
				System.out.print("two");
				break;
			case '3':
				System.out.print("three");
				break;
			case '4':
				System.out.print("four");
				break;
			case '5':
				System.out.print("five");
				break;
			case '6':
				System.out.print("six");
				break;
			case '7':
				System.out.print("seven");
				break;
			case '8':
				System.out.print("eight");
				break;
			case '9':
				System.out.print("nine");
				break;
			case '0':
				System.out.print("zero");
				break;
			default:
				System.out.println("null");
			}
			System.out.print(" ");
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Enter a Number: ");
		Scanner scan = new Scanner(System.in);
		
		String n = scan.next();
		char[] ch = n.toCharArray();
		
		NumberToWords res = new NumberToWords();
		res.toWords(ch);
		
		scan.close();
//		int rev=0;	
//		while(num!=0) {
//			int dig = num%10;
//			rev = rev*10+ dig;
//			num = num/10;
//		}
//		System.out.println(rev);
		
//		while(rev!=0) {
//			int dig = rev%10;
//			num = num*10+ dig;		
//			rev = rev/10;
//	
//		System.out.println(num);
	}

}
