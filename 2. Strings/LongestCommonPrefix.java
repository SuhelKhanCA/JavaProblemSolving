public class LongestCommonPrefix {
    static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // start with the first string in the array as initial prefix
        String prefix = strs[0];

        // compare the current prefix with each string in the array

        for (int i = 1; i < strs.length; i++) {
            // Narrow down the prefix with each comparision
            while (strs[i].indexOf(prefix) != 0) {
                // sshorten the prefix by one character from the end
                prefix = prefix.substring(0, prefix.length() - 1);

                // if the prefix becomes empty, there is no common prefix
                if (prefix.isEmpty()) {
                    return "";
                }

            }
        }

        return prefix;
    }
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}