import java.util.Arrays;

public class InPlaceMergeSort {
    public static void main(String[] args) {
        int[] arr = { 34, 7, 3, 10, 2 };
        sort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    
    static void sort(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }
        
        int mid = (s + e) / 2;
        sort(arr, s, mid);
        sort(arr,mid, e);

        merge(arr, s, mid, e);
    }
    
    static void merge(int[] arr, int s, int mid, int e) {
        int[] mix = new int[e-s];

        int i = s;
        int j = mid;
        int k = 0;

        while (i < mid && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }

            k++;
        }
        // one of array remained, so copy these too

        while (i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        // modify original array
        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
    }
}
