package Level1;

public class SumOfUptoN {
    static int sumOfUptoN(int n){
        if(n == 1){
            return 1;
        }
        return n + sumOfUptoN(n - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        int sum = sumOfUptoN(n);
        System.out.println(sum);
    }
}
