package LinearSearch;

public class MaximumIn2DArray {
    public static void main(String[] args) {
        int a[][] = {
                { 23, 4, 1 },
                { 18, 12, 3, 9 },
                { 78, 99, 34, 56 },
                { 19, 12 }
        };
        int ans = maxSearch(a);
        System.out.println("Maximum in the array is : " + ans);
    }

    public static int maxSearch(int[][] a) {
        if (a.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }
        return max;
    }
}
