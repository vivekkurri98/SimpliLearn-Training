package com.p1;

import java.util.Scanner;

public class VowelsRemover {
	
	public void removeVowels(char[] ch) {
		for (int i = 0; i < ch.length; i++) {
			if(!(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')) {
				System.out.print(ch[i]);
			}
		}
	
	}
	public static void main(String[] args) {
		System.out.println("Enter a string to remove Vowels");
		Scanner scan = new Scanner(System.in);
		String str = scan.next().toLowerCase();
		char[] ch = str.toCharArray();
		
		VowelsRemover vr = new VowelsRemover();
		vr.removeVowels(ch);
		
	}
}
