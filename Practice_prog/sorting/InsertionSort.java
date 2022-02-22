package sorting;

import java.util.Arrays;

public class InsertionSort{
    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 2, 4};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    Swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    private static void Swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;
    }
}
