import java.util.*;
public class ReversedNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int cevap;
		System.out.print("Enter a postive integer: ");
		int sayi = input.nextInt();
		System.out.println(sayi);
			cevap = reversed(sayi);
			if(sayi == cevap) {
				System.out.println(sayi+" is a palindrome");
			}else {
				System.out.println(sayi+" is not a palindrome");
			}
		}
		
		
		



	public static int reversed(int a) {
	    int reversedNumber = 0;
	    while (a > 0) {
	        int remainder = a % 10; // Gets the last digit of the number
	        reversedNumber = reversedNumber * 10 + remainder; // adds the last digit in reverse
	        a /= 10; // subtracts the last digit from the number
	    }
	    return reversedNumber;
	}

}