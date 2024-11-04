import java.util.Arrays;

public class InPlaceMergeSort {
    public static void main(String[] args) {
        int[] arr = { 34, 7, 3, 10, 2 };
        arr = sort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    
    static void sort(int[] arr, int s, int e) {
        if (arr.length == 1) {
            return arr;
        }
         s = 0;
         e = arr.length;
         int mid = arr.length / 2;
        int[] left = sort(arr, s, mid);
        int[] right = sort(arr,mid, e);

        return merge(arr, s, e);
    }
    
    static int[] merge(int[], int s, int e) {
        int[] mix = new int[];

        int i = s;
        int j = m;
        int k = e;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }

            k++;
        }
        // one of array remained, so copy these too

        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }
}
