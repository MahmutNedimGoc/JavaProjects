import java.util.Scanner;

public class soru1 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int[][] array = new int[a][b];
		for(int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = input.nextInt();
			}
		}
		for(int i = b-1; i >= 0; i--) {
			for (int j = a-1; j >= 0;j--) {
				System.out.print(array[j][i]+" ");
			}
			System.out.println();
		}
	}
}
