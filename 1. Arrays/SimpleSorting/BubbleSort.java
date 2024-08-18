import java.util.Arrays;
class BubbleSort{ // Syncing sort OR Exchange sort ====> Stable sorting algo
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length -1;
        bubbleSort(arr, n);
        System.out.println("Sorted array is : "+ Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr, int n){
        boolean swapped = false;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n-i; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
        }
        if(!swapped){
            return;
        }
    }
}