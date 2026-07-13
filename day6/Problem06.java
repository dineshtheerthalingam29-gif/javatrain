import java.util.*;
public class Problem06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the arrays: ");
        int[] array = new int[5];
        int sum = 0;
        for(int i=0;i<5;i++) {
            array[i] = sc.nextInt();
        }
        for(int i=0;i<5;i++) {
            sum += array[i];
        }
        System.out.print("Sum: " + sum);
    }
}