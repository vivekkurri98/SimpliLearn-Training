package com.p1;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramsCheck {
	
	public static boolean checkAnagrams(String str1, String str2) {
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		Arrays.sort(ch1);
		System.out.println(ch1);
		Arrays.sort(ch2);
		System.out.println(ch2);
		if(Arrays.equals(ch1, ch2))
			return true;
		return false;
	}

	public static void main(String[] args) {
				
				System.out.println("Enter 1st word");
				Scanner scan = new Scanner(System.in);
				String str1 = scan.next();
				System.out.println("Enter 2nd word");
				String str2 = scan.next();
				scan.close();
				
				if(checkAnagrams(str1, str2)) {
					System.out.println("Entered words are Anagrams");
				}
				else {
					System.out.println("Entered words are not anagrams");
				}
				
	}

}
