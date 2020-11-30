package com.p1;

public class NumberOfOccurrences {

	public static void main(String[] args) {
		String str = "Vivek Vivek Kurri Kurri Vivek kurri";
		
		String[] ch = str.split(" ");
		
		int size = ch.length;
		
		//System.out.println(ch.length);
		
		for(int i=0; i<size; i++) {
			int count=1;
			for(int j=i+1; j<size; j++) {
				if(ch[i].equals(ch[j])) {
					count++;
				}
			}
			if(count>1) {
			System.out.println(ch[i]+" "+count);
			}
		}
		

	}

}
