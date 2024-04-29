import java.util.Scanner;

public class sınav1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your choice: (1:number check, 2:all up to bound)");
		int a = input.nextInt();
		System.out.println(a);
		if(a == 1) {
			System.out.print("Enter a number to check: ");
			int number = input.nextInt();
			System.out.println(number);
			int cevap = number_check(number);
			if(cevap == 1) {
				System.out.println(number + " is a Strange Number.");
			}else {
				System.out.println(number + " is not a Strange Number.");
			}
		}else if (a == 2) {
			int cevap2;
			System.out.print("Enter a number as an upper bound, N:");
			int sayi = input.nextInt();
			int[] array = new int[sayi+1];
			for(int i = 1; i< array.length; i++) {
				array[i] = i;
			}
			
	}
}
	public static int number_check(int x) {
		int temp;
		int cevap = 0;
		boolean kontrol;
		while (true) {
			temp = x %10;
			cevap += temp*temp;
			temp = 0;
			x /= 10;
			if(x <= 0) {
				kontrol = checktrue(cevap);
				System.out.println(cevap);
				if(kontrol == true) {
					return cevap;
				}else {
					x = cevap;
					cevap = 0;
				}
			}else {
				continue;
			}
		}
	}
	
	public static boolean checktrue(int q) {
		if (q < 10) {
			return true;
		}else {
			return false;
		}
		
	}

}
