package com.p1;

public class Array {
	
	/*
	 *       a   b
	 *       10  54
	 *       64  10
	 *       64  54
	 *       
	 */

	public static void main(String[] args) {
		int[] arr = {10, 54, 4, 23, 1, 2};
		int len = arr.length;
		
		System.out.println("Without using 3rd Variable");
		for(int i=0; i<len; i++) {
			for(int j=i; j<len; j++) {
				
				if(arr[i] > arr[j]) {
					
					arr[i] = arr[i] + arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];
					
				}
			}
		}

		for(int i=0; i<len; i++) {			
				System.out.println(arr[i]);
		}
		
		System.out.println("\nUsing 3rd Variable");
		for(int i=0; i<len; i++) {
			for(int j=i; j<len; j++) {
				
				if(arr[i] > arr[j]) {
					
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
		}

		for(int i=0; i<len; i++) {			
				System.out.println(arr[i]);
		}
		
	}
}
