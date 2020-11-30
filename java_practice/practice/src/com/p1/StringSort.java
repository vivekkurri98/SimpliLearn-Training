package com.p1;

public class StringSort {

	/*
	 * i/p: hello axbycz
	 * o/p" ehllo abcxyz
	 */
	
	public static void main(String[] args) {
		String str = "hello axbycz vivek kurri";
		String[] words = str.split(" ");
		int i=0;
		int temp=0;
		
		do {
			char[] ch = words[i].toCharArray();
			int size = ch.length;
			
			for(int j=0; j<size; j++) {
				for(int k=j+1; k<size; k++) {
	
					if(ch[j] > ch[k]) {
						temp = ch[j];
						ch[j] = ch[k];
						ch[k] = (char)temp;
					}
				}
			}
			System.out.print(ch);
			System.out.print(" ");
			i++;
			
		}while(i<words.length);
		
	}

}
