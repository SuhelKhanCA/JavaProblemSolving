package Level1;

public class Reverse {
    static int reverse = 0;
    static void rev(int n){
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        reverse = 10 * reverse + rem;
        rev(n/10);
    }
    // f(N, args) = rem*10^arg-1 + f(N/10, arg-1)
    static int rev2(int n){
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }
    static int helper(int n, int digits){
        if (n == 0) {
            return 0;
        }
        int rem = n%10;
        return rem * (int)Math.pow(10, digits) + helper(n/10, digits-1);
    }
    public static void main(String[] args) {
        int n= 1234;
        // rev(n);
        // System.out.println(reverse);
        System.out.println(rev2(n));
    }
}
