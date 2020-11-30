package com.p1;

public class Demo {

	public static void main(String[] args) {

		String str1 = "hello heyy how are you fine";
		String[] word = str1.split(" ");
		
		for(int i=0; i<word.length; i++) {
			System.out.println(word[i]);
		}
		String captWord = "";
		
		for(String w:word) {
			String first = w.substring(0,1);
			String afterFirst = w.substring(1);
			captWord += first.toUpperCase()+afterFirst+" ";
		}
		System.out.println(captWord.trim());
	}
}
