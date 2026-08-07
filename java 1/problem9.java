import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        
        // Print top half and middle row
        for (int stars = 1; stars <= n; stars += 2) {
            int spaces = (n - stars) / 2;
            printLine(spaces, stars);
        }
        
        // Print bottom half
        for (int stars = n - 2; stars >= 1; stars -= 2) {
            int spaces = (n - stars) / 2;
            printLine(spaces, stars);
        }
    }
    
    private static void printLine(int spaces, int stars) {
        for (int i = 0; i < spaces; i++) System.out.print(" ");
        for (int i = 0; i < stars; i++) System.out.print("*");
        System.out.println();
    }
}