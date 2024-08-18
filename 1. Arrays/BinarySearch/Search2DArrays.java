import java.util.*;

class Search2DArrays{
    public static void main(String[] args){
        int[][] arr = {
                {18, 9, 12},
                {36, -4, 91},
                {44, 33, 16}
        };

        int [][] arrSorted = { // sorted by row and column
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {28, 29, 37, 49},
            {33, 34, 38, 50}
        };

        int target = 33;
        int[] ans = new int[2];

        // Linear search
        ans = linearSearch(arr, target);
        System.out.println("Found at : " + Arrays.toString(ans));

        // binary search
        ans = binarySearch(arrSorted, target);
        System.out.println("Found at : " + Arrays.toString(ans));
    }
    
    // Linear search --> O(n^2)
    static int[] linearSearch(int [][] a, int target){
        for(int i=0; i< a.length; i++){
            for(int j=0; j< a[i].length; j++){
                if(a[i][j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }


    // Binary Search ---> O(n)
    static int[] binarySearch(int [][] a, int target){
        int row = 0;
        int col = a[0].length - 1;

        while(col >= 0 && row <= a[0].length-1){
            if(a[row][col] == target){
                return new int[]{row, col};
            }else if(a[row][col] > target){
                col--;
            }else{
                row++;
            }
        }

        return new int[]{-1, -1};
    }
}