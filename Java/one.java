// Create an Array with values (1, 2, 3, 4, 5, 6, 7) and shuffle it

import java.util.*;

class shuffleAnArray {
    public static void shuffle(int arr[]) {
        for (int i = arr.length - 1; i >= 1; i--) {
            Random randomNum = new Random();

            int j = randomNum.nextInt(i + 1);
            
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String arg[]) {
        int[] arr = { 1, 2, 3, 4, 5, 6,7 };
        System.out.println("Original Array: " + Arrays.toString(arr));
        shuffle(arr);
        System.out.println("Shuffle Array: " + Arrays.toString(arr));
    }
}