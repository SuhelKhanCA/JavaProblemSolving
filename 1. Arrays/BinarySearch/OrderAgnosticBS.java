package BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        // int arr[] = {12, 23, 45, 65, 88, 123, 345, 999};
        int arr[] = {5, 2, 8, 7, 1, -33, -99, -100};

        int target = 1;
        System.out.println("Item found at: " + orderAgBS(arr, target));
    }

    public static int orderAgBS(int[] a, int target) {
        if (a.length == 0) {
            return -1;
        }

        int start = 0;
        int end = a.length - 1;
        boolean isAsc = a[start] < a[end];

        while (start <= end) {

            int mid = start + (end - start); // save us from Integer.MAX_VALUE problem
            if (a[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (a[mid] > target) {
                    end = mid -1;
                } else {
                    start = mid +1;
                }
            } else {
                if (a[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
