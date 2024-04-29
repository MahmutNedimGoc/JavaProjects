
import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int a = input.nextInt();
		System.out.println(a);
		double[] point = new double[a];
		for (int i = 0; i < point.length; i++) {
			point[i] = input.nextDouble();
		}
		yazdir(point,a);
		double max = max(point);
		cevap(point, max);
	}
	
	public static void yazdir(double a[],int b) {
		System.out.print("Enter "+b+" scores: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static double max(double[] point) {
	    double bestscore = point[0]; 
	    for (int i = 1; i < point.length; i++) {
	        if (point[i] > bestscore) {
	            bestscore = point[i];
	        }
	    }
	    return bestscore;
	}


	public static void cevap(double[] point, double best) {
		double temp;
		char a;
		for (int i = 0; i < point.length; i++) {
			temp = point[i] - best;
			if(temp >= -10) {
				a = 'A';
			}else if (temp >=-20) {
				a = 'B';
			}else if (temp >=-30) {
				a = 'C';
			}else if (temp >=-40) {
				a = 'D';
			}else {
				a = 'F';
			}
			System.out.println("Student "+i+" score is "+point[i]+" and grade is "+a);
			temp = 0;
		}
	}

}
