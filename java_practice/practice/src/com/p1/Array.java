package com.p1;

public class Array {

	public static void main(String[] args) {
		int[] arr = {10, 54, 4, 23, 1, 2};
		int len = arr.length;
		int temp = 0;
		for(int i=0; i<len; i++) {
			for(int j=i; j<len; j++) {
				
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Result wiith using 3rd varibale ");
		for(int i=0; i<len-1; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.print(arr[len-1]);

	
		for(int i=0; i<len; i++) {
			for(int j=i; j<len; j++) {
				if(arr[i] > arr[j]) {
					arr[i] = arr[i] + arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];
				}
			}
		}
		System.out.println("\nResult without using 3rd variable");
		for(int i=0; i<len-1; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.print(arr[len-1]);
	}
}
