package LinearSearch;

public class FindMin {
    public static void main(String[] args) {
        int arr[] = { 18, 12, 9, 14, 77, 50 };
  
        System.out.println("Is there minimum in array: " + FindMinimum(arr));
    }

    public static int FindMinimum(int[] arr) {
            if (arr.length == 0) {
                return Integer.MAX_VALUE;
            }
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            return min;
    }
}
