import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class SummerArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Read N
        String line = br.readLine();
        if (line == null) return;
        int n = Integer.parseInt(line.trim());
        
        // Read Array Elements
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        
        long oddFirstSwaps = 0;
        long evenFirstSwaps = 0;
        
        int oddTargetIndex = 0;
        int evenTargetIndex = 0;
        
        // Calculate swaps for both configurations
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0) { // Odd number
                oddFirstSwaps += (i - oddTargetIndex);
                oddTargetIndex++;
            } else { // Even number
                evenFirstSwaps += (i - evenTargetIndex);
                evenTargetIndex++;
            }
        }
        
        // The answer is the minimum of both configurations
        System.out.println(Math.min(oddFirstSwaps, evenFirstSwaps));
    }
}