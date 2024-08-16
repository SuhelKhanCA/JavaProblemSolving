// https://leetcode.com/problems/reverse-words-in-a-string/description/

class ReverseEachWord{

    public static String reverseWords(String s) {
       s = s.strip();
       String[] strArr = s.split("\\ ");
        String reversed = "";
        for(int i = strArr.length - 1; i >= 0;  i--){
            reversed = reversed + strArr[i];
            reversed = reversed.strip();
            if(i != 0) {
                reversed = reversed + " ";
            }
        }
        return reversed;
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }
}