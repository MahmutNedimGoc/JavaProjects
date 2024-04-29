package ders;

import java.util.Scanner;

public class MinValue {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter seven double numbers: ");
		double[] array = new double[7];
		for (int i = 0; i < array.length; i++) {
			array[i]= input.nextDouble();
			System.out.print(array[i]+" ");
		}
		System.out.println();
		double x = array[0];
		for (int i = 1; i < array.length; i++) {
			if(array[i] < x) {
				x = array[i];	
			}
		}
		System.out.println("The minimal value is "+x);
	}

}
