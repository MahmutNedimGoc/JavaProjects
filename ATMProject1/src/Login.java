import java.util.Scanner;

public class Login {
	
	public boolean Check(Account account) {
		String username;
		String password;
		Scanner input = new Scanner(System.in);
		System.out.print("Please insert username: ");
		username = input.nextLine();
		System.out.print("Please insert password: ");
		password = input.nextLine();
		
		
		if(account.getUsername().equals(username)&& account.getPassword().equals(password)){ //Checks username and password
			return true;
		}else {
			return false;
			}
	}
		
	
}
