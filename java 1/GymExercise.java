import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class GymExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input values
        int E = sc.nextInt();
        int N = sc.nextInt();
        
        Integer[] A = new Integer[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // Sort exercises in descending order to maximize energy drain first
        Arrays.sort(A, Collections.reverseOrder());

        int totalDrain = 0;
        int count = 0;

        // Greedily pick the highest-drain exercises up to 2 times each
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2; j++) {
                totalDrain += A[i];
                count++;

                // Check if target energy drain is reached
                if (totalDrain >= E) {
                    System.out.println(count);
                    return;
                }
            }
        }

        // If all exercises are exhausted and total drain is still less than E
        System.out.println(-1);
    }
}