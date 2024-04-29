package birincisoru;

import java.util.Scanner;

public class Question3 {

    public static int getBirthday(Scanner input) {
        int birthday = input.nextInt();
        while (birthday < 1 || birthday > 7){
            System.out.println("Please enter an appropriate day!");
            birthday = input.nextInt();
        }
        return birthday;
    }

    public static int charToNumber(char capitalLetter){
        int charNumb = capitalLetter  - 'A' + 1;

        return charNumb;
    }

    public static int findPrime(int number){
        int howMany = 0;
        for (int i = 0; i <= number; i++) {  
            if (isPrime(i)) {  
                howMany++;  
            }
            else{
                continue;
            }  
    }
        return howMany;
    }

    public static boolean isPrime(int number){
        if (number <= 1){
            return false;
        }
 
        for (int i = 2; i < number; i++){
            if (number % i == 0){
                return false;
            }
        }
 
        return true;
    }

    public static int findFibo(int fib) {
        if (fib == 0) {
            return 0;
        } 
        else if (fib == 1) {
            return 1;
        } 
        else {
            int[][] fibonacci = new int [fib + 1][2];
            fibonacci[0][0] = 0;
            fibonacci[0][1] = 1;
    
            for (int i = 1; i <= fib; i++) {
                fibonacci[i][0] = fibonacci[i - 1][1];
                fibonacci[i][1] = fibonacci[i - 1][0] + fibonacci[i - 1][1];
            }
    
            return fibonacci[fib][0];
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Question 1: Enter Your Birthday Day
        System.out.println("1) Please enter your birthday between 1 and 7 (example Mon=1, Tue=2..):");
        int birthday = getBirthday(input);
        System.out.println(birthday);

        //Question 2: Enter Initial Letter Of Your Name
        System.out.println("Enter initial letter of your name, (capital english letters only)!");
        char capitalLetter = input.next().charAt(0);
        charToNumber(capitalLetter);
        System.out.println(capitalLetter + " ---> " + (charToNumber(capitalLetter)));

        //Question 3: Guess Power Of The Numbers
        System.out.println("What is the " + birthday + "th power of " + charToNumber(capitalLetter) + "?");
        int power = (int) Math.pow(birthday, charToNumber(capitalLetter));
        System.out.println(power);

        //Question 4: Guess How Many Prime Numbers
        System.out.println("How many prime numbers can you count until " + power + "?");
        int yourGuess = input.nextInt();
        int counter = findPrime(power);
        
        while(yourGuess != counter){
            System.out.println("It's not correct!");
            yourGuess = input.nextInt();
        }       
        System.out.println(yourGuess);

        //Question 5: Find nth Term Of Fibonacci
        System.out.println("Enter " + yourGuess + "th element of the Fibonacci series:");
        int yourFibo = input.nextInt();
        int nthTerm = findFibo(yourGuess);

        while(yourFibo != nthTerm){
                System.out.println("It is not correct!");
                yourFibo = input.nextInt();
        }        
        System.out.println(yourFibo);

        //Question 6: Enter Your Age
        System.out.println("Enter your age(between 1-100):");
        int age = input.nextInt();

        System.out.println(age);

        //Question 7: Multipy The Numbers
        System.out.println("What is the result of " + yourFibo + "*" + age + "?");
        int yourResult = input.nextInt();
        int result = yourFibo*age;

        while(result != yourResult){
            System.out.println("It is not correct!");
            yourResult = input.nextInt();
        }
        System.out.println("Congratulations! You found the code! The code is " + result);
    }
}
