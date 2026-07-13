import java.util.*;
public class Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the arrays: ");
        int[] array = new int[5];
        for(int i=0;i<5;i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Enter the number to search: ");
        int num = sc.nextInt();
        for(int i=0;i<array.length;i++) {
            if(array[i] == num) {
                System.out.print("Number found at index: " + i);
                break;
            }
        }
        System.out.print("Number not found");
    }
}