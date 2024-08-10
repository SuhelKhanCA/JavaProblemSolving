package BinarySearch;

public class Demo {
    public static void main(String[] args) {
        int arr[] = {12, 23, 45, 65, 88, 123, 345, 999};
        int target = 65;
        System.out.println("Item found at: " + simpleBS(arr, target));
    }

    // return the index
    // return -1 if not found
    public static int simpleBS(int a[], int target){
        if (a.length == 0) {
            return -1;
        }

        int start = 0;
        int end = a.length - 1;

        while (start <= end) {

            int mid = start + (end - start); // save us from Integer.MAX_VALUE problem
            if (a[mid] > target) {
                end = mid - 1;
            } else if(a[mid] < target){
                start = mid +1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
