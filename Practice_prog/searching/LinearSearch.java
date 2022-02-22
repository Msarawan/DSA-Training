package searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,4,6,8,10};
        System.out.println(linearsearch( 8, arr));
    }

    private static int linearsearch(int element, int[] arr) {

        for (int i = 0; i <= arr.length ; i++) {
            if (element == arr[i]) {
                return i;
            }
        }

        return -1;

    }
}

