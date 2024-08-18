import java.util.Arrays;

class InsertionSort{ // Stable
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length -1;
        insertionSort(arr, n);
        System.out.println("Sorted array is : "+ Arrays.toString(arr));
    }
    public static void insertionSort(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for(int j = i + 1; j > 0; j--){
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }else{
                    break;
                }
            }
        }
    }
}
