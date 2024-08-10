package LinearSearch;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int a[][] = {
                { 23, 4, 1 },
                { 18, 12, 3, 9 },
                { 78, 99, 34, 56 },
                { 19, 12 }
        };
        int target = 199;

        System.out.println("Is target there in array: " + search(a, target));
    }

    public static boolean search(int[][] a, int target) {
        if (a.length == 0) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
