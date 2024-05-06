import java.util.Scanner;

public class ATM {
	
	public void Start(Account account) {
		
		Scanner input = new Scanner(System.in);
		Login login = new Login();
		System.out.println();
		System.out.println();
		System.out.println("     Welcome    ");
		System.out.println("*********************************************");
		System.out.println("      Login      ");
		int check = 3;
		while (true) {
			if(login.Check(account)) {  //Checks the values coming from the login object and decreases the Check value if it is wrong.
				System.out.println();
				System.out.println("Login successful");
				System.out.println("*********************************************");
				break;
			}else {
				System.out.println("Invalid Username or Password");
				check--;
			} 
			if (check == 0) {  // If check value equals 0, it finishes the code
				System.out.println("No more attempt");
				return;
			}
		}
		String transactions = "1. Check balance\n" +
				 "2. Deposit Money\n" +
				"3. Whitdraw Money\n" +
				"4. Logout";
		System.out.println(transactions);
		System.out.println("*********************************************");
		
		while (true) {
			System.out.println();
			System.out.print("Select Transaction: ");   //Selects transactions
			String choice = input.nextLine();
			
			if(choice.equals("1")) { //Show Balance
				System.out.println("Balance: "+ account.getBalance());;
			}
			
			else if (choice.equals("2")) { //Deposit Money
				System.out.print("how much money will you deposit: ");
				String money1 = input.nextLine();
				int money = Integer.parseInt(money1);
				account.deposit(money);
				System.out.println("Deposit Success");
			}
			
			else if (choice.equals("3")) { //Whitdraw Money
				System.out.print("how much money will you whitdraw: ");
				String money1 = input.nextLine();
				int money = Integer.parseInt(money1);
				account.withdraw(money);			
			}
			
			else if (choice.equals("4")) {  //End the while loop
				System.out.println("Log Off.....");
				break;
			}else {
				System.out.println("Wrong input");
			}
		}
		
	}
}
