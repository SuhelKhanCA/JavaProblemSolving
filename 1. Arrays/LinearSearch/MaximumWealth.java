package LinearSearch;
// https://leetcode.com/problems/richest-customer-wealth/
public class MaximumWealth {
    public static void main(String[] args) {
        int[][] a = {
            {1,2,3},
            {3,2,1},
            {1,5}
        };
        System.out.println("Maximum wealth: "+ maximumWealth(a));
    }

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;

        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                 
                sum += accounts[person][account];
            }

            if (sum > maxWealth) {
                maxWealth = sum;
            }
        }
        return maxWealth;
    }
}
