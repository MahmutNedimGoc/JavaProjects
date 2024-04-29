/*Some Websites impose certain rules for passwords. Write a method that checks whether a string is a valid password. Suppose the password

rules are as follows:

■ A password must have at least eight characters.

■ A password must contain only letters and digits.

■ A password must contain at least two digits.

Write a program that prompts the user to enter a password and displays "Valid Password" if the rules are followed, or "Invalid Password" otherwise.*/


import java.util.Scanner;

public class PasswordCheck{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }

    public static boolean isValidPassword(String password) {
        // Rule 1: Password must have at least eight characters.
        if (password.length() < 8) {
            return false;
        }

        // Rule 2: Password must contain only letters and digits.
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
        }

        // Rule 3: Password must contain at least two digits.
        int digitCount = 0;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        return digitCount >= 2;
    }
}