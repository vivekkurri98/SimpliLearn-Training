package com.p1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		System.out.println("Enter a number: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum = 1;
		for(int i=num; i>0; i--) {
			sum = sum*i;
		}
		System.out.println(sum);
		
		int res = 1;
		while(num!=1) {
			res = res*num;
			num--;
		}
		System.out.println(res);
		
		scan.close();
	}

}
