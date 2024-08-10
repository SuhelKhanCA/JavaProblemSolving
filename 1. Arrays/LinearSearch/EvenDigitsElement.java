package LinearSearch;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

class Solution {
    public int findNumbers(int[] nums) {
        int count  = 0;
        for(int i = 0; i < nums.length; i++){
            if (nums[i] < 0) {
                nums[i] *= -1;
            }
            if(isEven(nums[i])){
                count++;
            }
        }
        return count;
    }

    public static boolean isEven(int num){
        int c = 0;
        while(num != 0){
            num = num / 10;
            c++;
        }
        if(c % 2 == 0){
            return true;
        }

        return false;
    }
}
