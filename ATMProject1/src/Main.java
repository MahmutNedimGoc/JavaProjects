import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Account account = new Account();  //Calls the Account object
		System.out.print("Please input new username: ");
		String username = input.nextLine();
		account.setUsername(username); //Username and password are set in the Account object
		System.out.print("Please input new password: ");
		String password = input.nextLine();
		account.setPassword(password);
		account.setBalance(0);
		ATM atm = new ATM(); //Calls the ATM object
		atm.Start(account); //values are sent to ATM object
		System.out.println("Have a nice day :)");
		
	}

}
