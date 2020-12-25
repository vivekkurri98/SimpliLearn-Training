package com.p1;

import java.util.Scanner;

public class FibonaciSeries {
	//0 1 1 2 3 5 8
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a=0;
		int b=1;
		System.out.print(a+" "+b);
		 
		for(int i=2; i<n; i++) {
			int res = a+b;
			System.out.print(" "+res);
			a=b;
			b=res;	
		}
		
		scan.close();
	}

}
