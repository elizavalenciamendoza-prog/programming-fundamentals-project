import java.util.Scanner;

/**
 * My contribution to the group project. 
 * This program checks if a number is prime (Problem 8, Unit 1).
 * I used a while loop to handle the logic.
 */
public class PrimeChecker {

    public static void main(String[] args) {
        // Standard way to get data from the keyboard [4, 5]
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a positive integer: ");
        
        // Basic check to see if the user typed a number
        if (scanner.hasNextInt()) {
            int myNumber = scanner.nextInt();

            // Calling the method and printing the result
            if (verifyIfPrime(myNumber)) {
                System.out.println(myNumber + " is a prime number.");
            } else {
                System.out.println(myNumber + " is not a prime number.");
            }
        } else {
            System.out.println("That is not a valid integer.");
        }

        scanner.close(); // Closing the scanner to be neat [6]
    }

    /**
     * This method tests primality using a while loop.
     * Logic: A prime number is only divisible by 1 and itself [7].
     */
    public static boolean verifyIfPrime(int n) {
        // Numbers less than 2 are never prime
        if (n < 2) {
            return false;
        }

        int divisor = 2;
        boolean foundDivisor = false; // This is my flag variable [8]

        // We check divisors while the condition is true and no divisor is found
        while (divisor * divisor <= n && !foundDivisor) {
            // Using modulo (%) to check for zero remainder [9]
            if (n % divisor == 0) {
                foundDivisor = true;
            }
            divisor++; // Incrementing the counter [10]
        }

        // If foundDivisor is still false, it means it's prime
        return !foundDivisor;
    }
}
