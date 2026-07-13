import java.util.*;
public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Diagonal elements of the matrix are: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(i==j) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}