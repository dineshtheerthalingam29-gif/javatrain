import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Handle rotation index
        k = k % n;
        
        StringBuilder sb = new StringBuilder();
        
        // Print from index K to N-1
        for (int i = k; i < n; i++) {
            sb.append(arr[i]).append(" ");
        }
        
        // Print from index 0 to K-1
        for (int i = 0; i < k; i++) {
            sb.append(arr[i]).append(" ");
        }
        
        System.out.println(sb.toString().trim());
    }
}