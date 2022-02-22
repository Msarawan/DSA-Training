package searching;

public class BS {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 88};
        int element = 88;
        System.out.println(Search(arr, element, 0, arr.length - 1));
    }

    static int Search(int[] arr, int element, int s, int e) {

        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (arr[mid] == element) {
            return mid;
        }
        if (element < arr[mid]) {
            return Search(arr, element, s, mid - 1);
        }

        return Search(arr, element, mid + 1, e);

    }
}

