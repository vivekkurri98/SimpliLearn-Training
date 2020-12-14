package com.p1;

import java.util.Scanner;
/*
 * A 5
 * E
 */
public class Pattern {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<i; j++) {
//				System.out.print(i+"*");
//			}
//			System.out.print("\n");
//		}
//		
//		
//		for(int i=n; i>0; i--) {
//			for(int j=i; j>0; j--) {
//			System.out.print(i+"*");
//			}
//			System.out.print("\n");
//		}
		
		System.out.println("Enter an Alphabet");
		char ch = scan.next().charAt(0);		
		ch = (char) (ch+n-1);
		System.out.println(ch);
	}

}
 /* 
  * ABCBA
  * AB BA
  * A   A
  */