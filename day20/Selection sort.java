import java.util.Arrays;

public class SelectionSortDescending {
    public static void main(String[] args) {

        int[] arr = {25, 10, 40, 5, 30};

        for (int i = 0; i < arr.length - 1; i++) {

            int max = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }

        System.out.println("Descending Order:");
        System.out.println(Arrays.toString(arr));
    }
}