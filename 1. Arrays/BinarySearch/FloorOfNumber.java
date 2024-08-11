package BinarySearch;

public class FloorOfNumber {
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 9, 14, 16, 18}; // target = 14 or target = 15 -----> 14

        int target = 14; // or 15

        System.out.println("Floor of " + target+ " is: "+ findFloor(arr, target));
    }
    // ceiling calculation
    public static int findFloor(int[] arr, int target) {
      if (arr.length == 0) {
        return Integer.MAX_VALUE;
      }

      int start = 0;
      int end = arr.length - 1;
      // Check if the target is smaller than the smallest element
      if (target <= arr[start]) {
        return arr[start];
    }

    // Check if the target is larger than the largest element
    if (target > arr[end]) {
        return Integer.MAX_VALUE;
    }     

      boolean isAsc = arr[start] < arr[end];

      while (start <= end) {
        int mid = start + (end - start)/2;
        if (arr[mid] == target) {
            return arr[mid];
        }
        if (isAsc) {
            if (arr[mid] > target) {
                end = mid - 1;
            }else{
                start = start + 1;
            }
        } else {
            if (arr[mid] > target) {
                start = mid + 1;
            } else {
                end = mid -1;
            }
        }
      }

      return arr[end];
    }
}
