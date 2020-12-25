package com.p1;

import java.util.Scanner;

public class VowelsRemover {
	
	public void removeVowels(String str) {
		String[] words = str.split(" ");
		char[] ch = null;
		
		for(int k=0; k<words.length; k++) {
			ch = words[k].toCharArray();
			for (int i = 0; i < ch.length; i++) {
				if(!(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')) {
					System.out.print(String.valueOf(ch[i]));
				}
			}
			if(words[k].contains("aeiou")) {
				System.out.print("null");
			}
			System.out.print(" ");
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter a string to remove Vowels");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine().toLowerCase();

		VowelsRemover vr = new VowelsRemover();
		vr.removeVowels(str);
		
	}
}
