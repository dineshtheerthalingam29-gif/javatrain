import java.util.Scanner;
public class Problem06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();
        int[][] Matrix1 = new int[rows][cols];
        System.out.println("Enter the elements of Matrix1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                Matrix1[i][j] = sc.nextInt();
            }
        }
        int[][] Matrix2 = new int[rows][cols];
        System.out.println("Enter the elements of Matrix2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                Matrix2[i][j] = sc.nextInt();
            }
        }
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = Matrix1[i][j] + Matrix2 [i][j];
            }
        }
        System.out.println("Sum of the two matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}