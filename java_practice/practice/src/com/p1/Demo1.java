package com.p1;

public class Demo1 {

	public static void main(String[] args) {
		String s="a19b11c1";
		char[] chars= s.toCharArray();
		StringBuilder sb=new StringBuilder();
		int i=0;
		int optionalNumberValue = 0;
		
		do{
			char ch=chars[i];
			int numberValue=Character.getNumericValue(chars[i+1]);
			
			if(i+2<chars.length){
				optionalNumberValue=Character.getNumericValue(chars[i+2]);
			}
			
			if(optionalNumberValue>=1 && optionalNumberValue<=9){
				numberValue=Integer.parseInt(String.valueOf(numberValue)+String.valueOf(optionalNumberValue));
				i++;
			}
			
			for(int j=0;j<numberValue;j++){
			sb.append(ch+"");
			}
			i+=2;
			
		}while(i<chars.length);

		System.out.println(sb);

	}

}
