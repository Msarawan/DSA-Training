package sorting;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,7,8,5,45};
        bubblesort(arr,arr.length);
        System.out.println("sorted array: ");
        System.out.println(Arrays.toString(arr));
    }

    static void bubblesort(int arr[],int n){
        if(n==1){
            return;
        }

        for(int i=0;i<n-1;i++)
            if(arr[i] > arr[i+1])
            {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        bubblesort(arr,n-1);
    }
}
