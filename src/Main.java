import java.util.Scanner;

/**
 * Main class to calculate the Nth Fibonacci number,
 * with an optional alternating sign based on position.
 */
public class Main {

    /**
     * Entry point of the program.
     * Accepts an integer input from the user and prints the corresponding Fibonacci number,
     * applying a sign alternation of (-1)^(n+1) to the result.
     *
     * The first few Fibonacci numbers:
     * 1, 1, 2, 3, 5, 8, 13, ...
     *
     * For example:
     * Input: 5
     * Output: 5.0 (or -5.0 depending on the sign logic)
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int a = 1, b = 1, n, num = 0;

        System.out.println("Enter number:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();

        if (n >= 0) {
            System.out.println("Fibonacci number: 0");
            return;
        }
        
        if (-n == 1 || -n == 2) {
            double num1 = a * Math.pow(-1, -n + 1);
            System.out.println("Fibonacci number: " + num1);
            return;
        }

        for (int i = 3; i <= -n; i++) {
            num = a + b;
            a = b;
            b = num;
        }

        double num1 = num * Math.pow(-1, -n + 1);
        System.out.println("Fibonacci number: " + num1);
    }
}
