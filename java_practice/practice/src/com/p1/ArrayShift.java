package com.p1;

import java.util.Scanner;

class ArrayShift { 
    /*Function to left rotate arr[] of size n by d*/
    void leftRotate(int arr[], int d, int n) 
    { 
        for (int i = 0; i < d; i++) 
            leftRotatebyOne(arr, n); 
    } 
  
    void leftRotatebyOne(int arr[], int n) 
    { 
        int i, temp; 
        temp = arr[0]; 
        for (i = 0; i < n - 1; i++) 
            arr[i] = arr[i + 1]; 
        	arr[i] = temp; 
    } 
  
    /* utility function to print an array */
    void printArray(int arr[], int n) 
    { 
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
    } 
  
    // Driver program to test above functions 
    public static void main(String[] args) 
    { 
    	ArrayShift rotate = new ArrayShift();
    	System.out.println("Enter no of ele");
    	Scanner scan = new Scanner(System.in);
    	int n =  scan.nextInt();
    	int[] arr = new int[n];
       for(int i=0; i<n; i++) {
    	   arr[i] = scan.nextInt();
       }
       
       int s = scan.nextInt();
        rotate.leftRotate(arr, s, n); 
        rotate.printArray(arr, n); 
    } 
} 