import java.util.*;
class SelectionSort{ // It's not stable sorting algo  // Performs well on  small lists
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;
        selectionSort(arr, n);
        System.out.println("Sorted Array : " + Arrays.toString(arr));
    }
    static void selectionSort(int[] arr, int n){
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
    }
}