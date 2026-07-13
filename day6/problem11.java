import java.util.*;
public class Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the arrays: ");
        int[] array = new int[5];
        for(int i=0;i<5;i++) {
            array[i] = sc.nextInt();
        }
        int start = 0;
        int end = 4;
        while(start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        System.out.print("Reversed array: ");
        for(int i=0;i<5;i++) {
            System.out.print(array[i] + " ");
        }
    }
}