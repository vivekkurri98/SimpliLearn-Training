package com.p1;

import java.util.Scanner;

public class MatrixSum {

	public static void main(String[] args) {
		System.out.println("Enter a number rows and columns");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] a = new int[row][col];
		
		System.out.println("Enter a martix A of "+row +" row and "+col +" column");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		int[][] b = new int[row][col];
		System.out.println("Enter a martix B of "+row +" row and "+col +" column");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		int[][] res = new int[row][col];
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				
				res[i][j] = a[i][j] + b[i][j];
			}
		}
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(res[i][j]+ " ");
			}
			System.out.println();
		}
		sc.close();

	}

}
