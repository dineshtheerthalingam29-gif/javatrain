package Day13;

import java.util.Arrays;

public class BinarySearch {
     public static void main(String[] args) {

        int[] arr = {10, 30, 50, 20, 40};

        Arrays.sort(arr);

        int key = 30;

        int index = Arrays.binarySearch(arr, key);

        if(index >= 0)
            System.out.println("Found at index " + index);
        else
            System.out.println("Not Found");
    }
    
}