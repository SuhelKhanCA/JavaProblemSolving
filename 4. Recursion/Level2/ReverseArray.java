// package Level2;

import java.util.Arrays;

public class ReverseArray {

    public static void reverse(int[] arr, int s, int e) {
        if (s < e) {
            int tmp = arr[s];
            arr[s] = arr[e];
            arr[e] = tmp;
            s++;
            e--;
        } else {
            return;
        }
        
        reverse(arr, s, e);
        
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        reverse(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}