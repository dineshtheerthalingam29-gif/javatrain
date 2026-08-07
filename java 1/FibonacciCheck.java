import java.util.Scanner;

public class FibonacciCheck {

    // Helper method to check if a number is a perfect square
    public static boolean isPerfectSquare(long num) {
        if (num < 0) {
            return false;
        }
        long root = (long) Math.sqrt(num);
        return (root * root == num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read input N
        if (sc.hasNextLong()) {
            long n = sc.nextLong();
            
            // Calculate 5*n^2 + 4 and 5*n^2 - 4
            // Using long to prevent integer overflow up to N = 10^9
            long val1 = 5 * n * n + 4;
            long val2 = 5 * n * n - 4;
            
            // Check if either is a perfect square
            if (isPerfectSquare(val1) || isPerfectSquare(val2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}