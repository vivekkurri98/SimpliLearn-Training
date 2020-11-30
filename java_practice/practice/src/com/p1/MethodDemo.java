package com.p1;

public class MethodDemo {
	
	public int sum(int[] arr) {
		int sum=0;
		for(int i=0; i<arr.length; i=i+2) {
			sum = sum + arr[i];
		}
		return sum;	
	}
	
	public void stringExtractor(String s) {
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if(Character.getNumericValue(chars[i])>=0 && Character.getNumericValue(chars[i])<=9){
				for (int j = 0; j < Character.getNumericValue(chars[i]); j++) {
					System.out.print(chars[i-1]);
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {2,1,2,1,2,1,2,1,2};
		MethodDemo res = new MethodDemo();
		System.out.println(res.sum(arr));
		res.stringExtractor("a2b3c4");
		//System.out.println(s(arr));
	}
	
//	private static int s(int[] arr) {
//		int sum=0;
//		for(int i=0; i<arr.length; i++) {
//			sum = sum + arr[i];
//		}
//		return sum;
//	}

}
