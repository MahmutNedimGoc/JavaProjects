
public class Account {
	private String username;
	private String password;
	private int balance;
	
	
	public Account() {

	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void deposit(int money) {    //Add money to balance
		this.balance += money;
	}
	
	public void withdraw(int money) {  //Subtracts money from the balance
		if((balance - money) < 0 ) {   //Checks whether the entered value is higher than the balance
			System.out.println("Have not enough money");
		}else {
			balance -= money;
			System.out.println("Whitdraw Success");
		}
	}
}
