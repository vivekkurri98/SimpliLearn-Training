package com.p1;

public class Demo {

	public static void main(String[] args) {
		String str = "a2b4c4";
		char[] chars = str.toCharArray();
		int i=0;
		StringBuffer sb = new StringBuffer();
		int optValue = 0;
		
		do {
		char ch = chars[i];
		int numberValue = Character.getNumericValue(chars[i+1]);
		
		if(i+2<chars.length) {
			optValue = Character.getNumericValue(chars[i+2]);
		}
		
		if(optValue>=1 && optValue<=9) {
			numberValue = Integer.parseInt(String.valueOf(numberValue) + String.valueOf(optValue));
		}
		i+=2;
		
		for(int j=0; j<numberValue; j++) {
			sb.append(ch+"");
		}
		}while(i<chars.length);
		
		System.out.println(sb);
//		for(int i=0; i<str.length(); i++) {
//			if( (ch[i] >= 65 && ch[i] <= 90) ||  (ch[i] >= 97 && ch[i] <= 122)) {	
//				
//			}
//			else
//				if(ch[i]>='0' && ch[i]<='9'){
//					
//						for(int j=0; j<Character.getNumericValue(ch[i]); j++) {
//							System.out.print(ch[i-1]+"");	
//					}
//				
//				}
//			}
		}

}
