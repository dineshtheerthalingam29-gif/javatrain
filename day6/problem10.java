import java.util.*;
public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the arrays: ");
        int[] array = new int[5];
        for(int i=0;i<5;i++) {
            array[i] = sc.nextInt();
        }
        int count = 0;
        for(int i=0;i<5;i++) {
            if(array[i] % 2 != 0) {
                count++;
            }
        }
        System.out.print("Count of odd numbers: " + count);
    }
}