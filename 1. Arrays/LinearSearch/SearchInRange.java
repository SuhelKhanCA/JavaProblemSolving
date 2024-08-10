package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int arr[] = {18, 12, -7, 3, 14, 28}; // search for 3 in the range of index 1 till 4
        int target = 3;

        System.out.println("Is target there in the specified range: " + search(arr, target));
    }

    static boolean search(int[] a, int target){

        if (a.length == 0) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                return true;
            }
        }
        return false;
    }
}
