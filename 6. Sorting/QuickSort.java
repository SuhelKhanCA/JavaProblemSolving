import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        // Quick sort
        int[] arr = { 54, 8, 5, 58, 1, 2 };

        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }
        int s = low;
        int e = high;
        int mid = s + (e - s) / 2;
        int pivot = nums[mid];

        while (s <= e) {
            while (nums[s] < pivot) {
                s++;
            }
            while (nums[e] > pivot) {
                e--;
            }

            if (s <= e) {
                int tmp = nums[s];
                nums[s] = nums[e];
                nums[e] = tmp;
                s++;
                e--;
            }
        }

        // now sort for the two halves
        sort(nums, low, e);
        sort(nums, high, s);
    }
}
