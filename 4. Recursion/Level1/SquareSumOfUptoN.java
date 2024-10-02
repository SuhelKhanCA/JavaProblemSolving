package Level1;

public class SquareSumOfUptoN {
    static int sumOfUptoN(int n){
        if(n == 1){
            return 1;
        }
        return n*n + sumOfUptoN(n - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        int sum = sumOfUptoN(n);
        System.out.println(sum);
    }
}
