import java.util.Arrays;

public class LongestSubSequence {
    static int maxSeq(int[] a) {
        if (a.length == 0) return 0;

        Arrays.sort(a);  // Sort the array
        int longestLen = 1, currentLen = 1;

        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1] + 1) {  // Check for consecutive numbers
                currentLen++;
            } else if (a[i] != a[i - 1]) {  // Reset if not consecutive
                longestLen = Math.max(longestLen, currentLen);
                currentLen = 1;
            }
        }
        
        return Math.max(longestLen, currentLen);  // Final check
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 15, 16, 17, 10, 30};
        System.out.println(maxSeq(arr));
    }
}

