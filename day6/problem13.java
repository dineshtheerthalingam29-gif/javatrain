import java.util.*;
public class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the arrays: ");
        int[] array = new int[5];
        for(int i=0;i<5;i++) {
            array[i] = sc.nextInt();
        }
        
        for(int i=0;i<5;i++) {
            for(int j=i+1;j<5;j++) {
                if(array[i]<array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        int SecondMax = array[1];
        System.out.println(Arrays.toString(array));
        System.out.println("The Second Largest Element in the array is: " + SecondMax);
    }
}