import java.util.*;
public class Problem11 {
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
        int flag = 1;
        if (rows != cols) {
            System.out.println("The matrix is not a square matrix.");
            flag = 0;
        }else {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (i != j && arr[i][j] != 0) {
                        flag = 0;
                    }
                    if (i == j && arr[i][j] != 1) {
                        flag = 0;
                    }
                }
            }
        }
        if (flag == 1) {
            System.out.println("The matrix is a identity matrix.");
        } else {
            System.out.println("The matrix is not a identity matrix.");
        }
    }
}