import java.util.*;
public class Problem02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the arrays: ");
        int[] array = new int[5];
        for(int i=0;i<5;i++) {
            array[i] = sc.nextInt();
        }
        System.out.print(Arrays.toString(array));
    }
}