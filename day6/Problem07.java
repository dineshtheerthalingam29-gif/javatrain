import java.util.*;
public class Problem07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the arrays: ");
        int[] array = new int[5];
        for(int i=0;i<5;i++) {
            array[i] = sc.nextInt();
        }
        int max = array[0];
        for(int i=0;i<5;i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        System.out.print("Maximum element: " + max);
    }
}