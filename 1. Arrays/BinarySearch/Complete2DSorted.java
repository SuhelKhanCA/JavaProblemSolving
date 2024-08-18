import java.util.*;
class Complete2DSorted{
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
            };
        int target = 4;
        int[] ans = new int[2];

        // binary search
        ans = binarySearch(arr, target);
        System.out.println("Found at : " + Arrays.toString(ans));
    }
    
    // Simple binary search
    static int[] simpleSearch(int[][] a, int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart) / 2;
            if(a[row][mid] == target){
                return new int[]{row, mid};
            }else if(a[row][mid] < target){
                cStart = mid + 1;
            }else{
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }
    //2D Binary Search ---> O(log(n) + log(m))
    static int[] binarySearch(int [][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length; // be catious, matrix may be empty

        if(rows == 1){
            return simpleSearch(matrix, 0, 0, cols - 1, target);
        }

        // run the loop till 2 rows remaining
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        while(rStart < (rEnd - 1)){
          
            int mid = rStart + (rEnd - rStart) / 2;
            if(matrix[mid][cMid] == target){
                return new int[]{mid, cMid};
            }else if(matrix[mid][cMid] < target){
                rStart = mid + 1;
            }else{
                rEnd = mid - 1;
            }
        }
        // now we have 2 rows
        // we need to find the column in which the target is present
        // we will do this by doing binary search on the 2 rows
        if(matrix[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }
        if(matrix[rStart + 1][cMid] < target){
            return new int[]{rStart + 1, cMid};
        }
        // search in the 1st half
        if(target <= matrix[rStart][cMid - 1]){
            return simpleSearch(matrix, rStart, 0, cMid-1, target);
        }

        // search in the second half
        if(target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols-1]){
            return simpleSearch(matrix, rStart,cMid+1, cols-1, target);
        }

        // search in the 3rd half
        if(target <= matrix[rStart + 1][cMid - 1]){
            return simpleSearch(matrix, rStart + 1, 0, cMid-1, target);
        }
        // search in the 4th half
        if(target <= matrix[rStart + 1][cMid + 1]){
            return simpleSearch(matrix, rStart + 1, cMid + 1, cols-1, target);
        }
        return new int[]{-1, -1};
    }
}