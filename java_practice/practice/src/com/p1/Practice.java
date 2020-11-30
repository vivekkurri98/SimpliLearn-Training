package com.p1;

public class Practice {

	public static void main(String[] args) {
		String str = "WXYZ";
		char[] ch = str.toCharArray();

		for(int i=0; i<ch.length-1; i++){
			
				System.out.println(str.substring(i+1,ch.length)+str.substring(0,i+1));
				}
	}

}