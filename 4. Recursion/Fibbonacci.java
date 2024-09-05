public class Fibbonacci {
    public static void main(String[] args) {
        int n = 5; // 5th number
        System.out.println(findFibonacci(n));
    }

    static int findFibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return findFibonacci(n - 1) + findFibonacci(n - 2);
        }
    }
}
