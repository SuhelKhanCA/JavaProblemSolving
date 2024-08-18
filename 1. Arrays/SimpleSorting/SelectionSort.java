import java.util.*;
class SelectionSort{
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;

            for (int i = 0; i < n; i++) {
                int min_idx = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[min_idx] > arr[j]) {
                        min_idx = j;
                    }
                }
                        int temp = arr[i];
                        arr[i] = arr[min_idx];
                        arr[min_idx] = temp;
            }
        System.out.println("Sorted Array : " + Arrays.toString(arr));
    }
}