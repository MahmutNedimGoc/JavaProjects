package ders;

import java.util.Scanner;

public class SumColumn {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3 by 4 matrix row by row:");
		double[][] x = new double[3][4];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				x[i][j] = input.nextDouble();
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
		sumColumn(x);
	}
	public static void sumColumn(double[][] m) {
		double sum = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				sum += m[j][i];
			}
			System.out.println("Sum of the elements at column "+i+" is "+sum);
			sum = 0;
		}
	}
}
