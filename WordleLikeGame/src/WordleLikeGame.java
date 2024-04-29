
import java.util.Scanner;

public class WordleLikeGame {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your player ID: ");
		long ID = input.nextLong();
		
		int sayi = 0;
		char YN ;   // Yes no question 
		boolean devamdurumu;
		int[] a_cevap = new int[4];  //4 digit number that the player must find
		int[] a_cevap2 = new int[5];  //5 digit number that the player must find
		
		System.out.println("Player "+ID+" has entered the game.");
		System.out.println("STAGE 1:");
		
		sayi = base_number();
		a_cevap = basamak_bulma(sayi);
		soru1(a_cevap, ID,sayi);
		
		System.out.println("Congratulations! Player "+ID+" passed the 1st Stage.");
		System.out.println("Do you want to continue?(Y/N): ");
		YN = input.next().charAt(0);
		
		devamdurumu = devam(YN);     // Part of shutting down or continuing the system depending on the response status
		if (devamdurumu == false) {
			System.out.println("Logging Off...");
			System.exit(1);
		}
		
		System.out.println("STAGE 2");
		sayi = base_number_q2();
		a_cevap2 = basamak_bulma_q2(sayi);
		soru2(a_cevap2, ID, sayi);
		
		System.out.println("Congratulations! Player "+ID+" passed the 2nd Stage.");
		System.out.println("You have won all the stages!");
		System.out.println("Logging Off...");
	}
	
	
	
	
	//Methods that checks whether the entered input is 4-digit or not
	public static int base_number() {
		int number;
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.print("Enter a 4-digit number to be guessed: ");
			number = input.nextInt();
			if(number >= 1000 && number< 10000) {
				return  number;	
			}else {
				System.out.println("Invalid input!");
				continue;
			}	
		}
		}
	
	
	//Methods that checks whether the entered input is 5-digit or not
	public static int base_number_q2() {
		int number;
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.print("Enter a 5-digit number to be guessed: ");
			number = input.nextInt();
			if(number >= 10000 && number< 100000) {
				return  number;	
			}else {
				System.out.println("Invalid input!");
				continue;
			}	
		}
		}
	
	
	//Methods that finds the digit values of the entered 4-digit input
	public static int[] basamak_bulma(int cvp) {
		int[] basamak = new int[5];
		
		for(int j = 4 ; j >= 0; j--) {
			basamak[j] = cvp % 10;
			cvp /= 10;
		}
		return basamak;
	}
	
	
	//Methods that finds the digit values of the entered 5-digit input
	public static int[] basamak_bulma_q2(int cvp) {
		int[] basamak = new int[7];
		
		for (int j = 5 ; j >= 0; j--) {
			basamak[j] = cvp % 10;
			cvp /= 10;
		}
		return basamak;
	}

	
	//The method in which the answer to the first question is written
	public static void soru1(int[] a_cevap, long kullanici_ID,int mainanswer) {
		Scanner input = new Scanner(System.in);
		int sayi1 = 0;    
		int[] oyuncu_cvp = new int[4];
		for (int j = 3; j > 0;) {    // for loop showing how many attempts are left
			System.out.println("Player "+kullanici_ID+" guess: ");
			sayi1 = input.nextInt();    //number guessed by the player
			if(sayi1 >= 1000 && sayi1 < 10000) {    //Methods that checks whether the entered input is 4-digit or not
				oyuncu_cvp = basamak_bulma(sayi1);
				if(sayi1 == mainanswer){
					System.out.println(".....   .....   .....   .....");
					for(int k = 1; k <= 4; k++ ) {          //for loop to print the digits of the entered number
							System.out.print(": "+oyuncu_cvp[k]+" :   ");
					}
					System.out.println();
					System.out.println(":...:   :...:   :...:   :...:   ");
					break;	
				}else {
					System.out.println(".....   .....   .....   .....   ");
					for(int k = 1; k <= 4; k++ ) {    //for loop to print the digits of the entered number
						if(oyuncu_cvp[k] == a_cevap[k]) {
							System.out.print(": "+oyuncu_cvp[k]+" :   ");
						}else {
							System.out.print(": x :   ");
						}	
					}
					System.out.println();
					System.out.println(":...:   :...:   :...:   :...:   ");
					j--;
						if(j== 0) {    //if structure that ends the main loop if there are no attempt left
								System.out.println("No more guess right! Logging off...");
								System.exit(1);
						}else {
					System.out.println("Wrong guess! Try again. You have "+j+" more guess right!");
						}
				}
			}else {   // if the correct values are not entered, the attempt to try is reduced and the error message is given.
				j--;
				if(j== 0) {    //if structure that ends the main loop if there are no attempt left
					System.out.println("No more guess right! Logging off...");
					System.exit(1);
				}else {
					System.out.println("Invalid input! Try again You have "+ (j) +" more guess right!");  
			}
			}
		}
	}
	
	
	//The method in which the answer to the second question is written
	public static void soru2(int[] a_cevap, long kullanici_ID,int mainanswer) {
		Scanner input = new Scanner(System.in);
		int sayi1 = 0;
		int[] oyuncu_cvp = new int[5];
		for (int j = 5; j > 0;) {   // for loop showing how many attempts are left
			System.out.println("Player "+kullanici_ID+" guess: ");
			sayi1 = input.nextInt();     //number guessed by the player
			if(sayi1 >= 10000 && sayi1 < 100000) {   //Methods that checks whether the entered input is 5-digit or not
				oyuncu_cvp = basamak_bulma_q2(sayi1);    
				if(sayi1 == mainanswer){
					System.out.println(".....   .....   .....   .....   .....");
					for(int k = 1; k <= 5; k++ ) {    //for loop to print the digits of the entered number
							System.out.print(": "+oyuncu_cvp[k]+" :   ");
					}
					System.out.println();
					System.out.println(":...:   :...:   :...:   :...:   :...:");
					break;	
				}else {
					System.out.println(".....   .....   .....   .....   .....");
					for(int k = 1; k <= 5; k++ ) {   //for loop to print the digits of the entered number
						if(oyuncu_cvp[k] == a_cevap[k]) {
							System.out.print(": "+oyuncu_cvp[k]+" :   ");
						}else {
							System.out.print(": x :   ");
						}	
					}
					System.out.println();
					System.out.println(":...:   :...:   :...:   :...:   :...:");
					j--;
						if(j== 0) {   //if structure that ends the main loop if there are no attempt left
								System.out.println("No more guess right! Logging off...");
								System.exit(1);
						}else {
					System.out.println("Wrong guess! Try again. You have "+j+" more guess right!");
						}
				}
			}else {   // if the correct values are not entered, the attempt to try is reduced and the error message is given.
				j--;
				if(j== 0) {    //if structure that ends the main loop if there are no attempt left
					System.out.println("No more guess right! Logging off...");
					System.exit(1);
				}else {
					System.out.println("Invalid input! Try again You have "+ (j) +" more guess right!");  
			}
			}
		}
	}
	
	
	//method by which the player determines whether to continue or not
	public static boolean devam (char c) {
		Scanner input = new Scanner(System.in);
		while(true) {
			if(c == 'y' || c =='n' || c == 'Y' || c =='N') {   //if structure that checks whether the answer is Y or N
				if(c== 'y' || c == 'Y') {
					return true;
				}else if (c == 'n' || c == 'N') {
					return false;
				}
				
			}
			else {
				System.out.println("You have entered an invalid character. Logging Off...");
				System.exit(1);
			}
		
		}
	}
			
}

