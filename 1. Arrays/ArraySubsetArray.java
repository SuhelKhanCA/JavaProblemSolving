// https://www.geeksforgeeks.org/problems/array-subset-of-another-array2317/1?page=1&sprint=94ade6723438d94ecf0c00c3937dad55&sortBy=submissions
import java.util.*;
class ArraySubsetArray{
    public String isSubset(long a1[], long a2[], long n, long m) {
        if (m > n) { // Early check for empty subset
            return "No";
        }

        // Hash map to store occurrences of elements in a1
        HashMap<Long, Integer> counts = new HashMap<>();
        for (long num : a1) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        // Iterate through a2 and check if each element has enough occurrences in a1
        for (long num : a2) {
            if (!counts.containsKey(num) || counts.get(num) == 0) {
                return "No";
            }
            counts.put(num, counts.get(num) - 1); // Decrement count for visited elements
        }

        return "Yes";
    }
}
