package LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int a[][] = {
                { 23, 4, 1 },
                { 18, 12, 3, 9 },
                { 78, 99, 34, 56 },
                { 19, 12 }
        };
        int target = 99;
        int ans[] = search(a, target);
        System.out.println("Target found in array at : " + Arrays.toString(ans));
    }

    public static int[] search(int[][] a, int target) {
        if (a.length == 0) {
            return new int[]{};
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
