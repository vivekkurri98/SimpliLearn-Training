package com.p1;

public class Demo {

	public static void main(String[] args) {
		String str = "a2b1c4";
		char[] ch = str.toCharArray();
		
		for(int i=0; i<str.length(); i++) {
			if( (ch[i] >= 65 && ch[i] <= 90) ||  (ch[i] >= 97 && ch[i] <= 122)) {	
				
			}
			else
				if(ch[i]>='0' && ch[i]<='9'){
					
						for(int j=0; j<Character.getNumericValue(ch[i]); j++) {
							System.out.print(ch[i-1]);	
					}
				
				}
			}
		}

}
