import java.util.*;
public class Problem08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the arrays: ");
        int[] array = new int[5];
        for(int i=0;i<5;i++) {
            array[i] = sc.nextInt();
        }
        int min = array[0];
        for(int i=0;i<5;i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        System.out.print("Minimum element: " + min);
    }
}