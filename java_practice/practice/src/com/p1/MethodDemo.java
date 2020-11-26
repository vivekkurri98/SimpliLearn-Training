package com.p1;

public class MethodDemo {
	
	public int sum(int[] arr) {
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;	
	}

	public static void main(String[] args) {
		int[] arr = {2,2,2,2,1,1,1,1};
		MethodDemo res = new MethodDemo();
		System.out.println(res.sum(arr));
		System.out.println(s(arr));
	}
	
	private static int s(int[] arr) {
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

}
