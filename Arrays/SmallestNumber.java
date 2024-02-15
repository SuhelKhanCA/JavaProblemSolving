package Arrays;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        System.out.print("Smallest no. whose product of digits is the above number: ");
        System.out.println(sol(n));
    }
    public static int sol(int n){
        String ans = "";
        for (int div = 9; div >= 2; div--) {
            while (n % div ==0) {
                n = n/div;
                ans = div + ans;
            }
        }
        if (n != 1) {
            return -1;
        } else {
            return Integer.parseInt(ans);
        }
        
    }
}
